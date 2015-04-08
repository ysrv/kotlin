/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.debugger.render

import com.intellij.debugger.DebuggerContext
import com.intellij.debugger.engine.evaluation.EvaluateException
import com.intellij.debugger.engine.evaluation.EvaluationContextImpl
import com.intellij.debugger.settings.NodeRendererSettings
import com.intellij.debugger.ui.impl.watch.FieldDescriptorImpl
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiExpression
import com.sun.jdi.Field
import com.sun.jdi.Method
import com.sun.jdi.ObjectReference
import com.sun.jdi.Value
import org.jetbrains.kotlin.codegen.PropertyCodegen
import org.jetbrains.kotlin.load.java.JvmAbi
import org.jetbrains.kotlin.name.Name

class DelegatedPropertyFieldDescriptor(
        project: Project,
        val objectRef: ObjectReference,
        val delegate: Field,
        val renderDelegatedProperty: Boolean
) : FieldDescriptorImpl(project, objectRef, delegate) {

    override fun calcValue(evaluationContext: EvaluationContextImpl?): Value? {
        if (evaluationContext == null) return null
        if (!renderDelegatedProperty) return super.calcValue(evaluationContext)

        val method = findGetterForDelegatedProperty()
        val threadReference = evaluationContext.getSuspendContext().getThread()?.getThreadReference()
        if (method == null || threadReference == null) {
            return super.calcValue(evaluationContext)
        }

        try {
            return evaluationContext.getDebugProcess().invokeInstanceMethod(
                    evaluationContext,
                    getObject(),
                    method,
                    listOf<Nothing>(),
                    evaluationContext.getSuspendContext().getSuspendPolicy()
            )
        }
        catch(e: EvaluateException) {
            return e.getExceptionFromTargetVM()
        }
    }

    override fun calcValueName(): String? {
        return with (StringBuilder()) {
            val classRenderer = NodeRendererSettings.getInstance()?.getClassRenderer()!!
            append(getName())
            if (classRenderer.SHOW_DECLARED_TYPE) {
                append(": ")
                append(classRenderer.renderTypeName(getValue()?.type()?.name()))
            }
            toString()
        }
    }

    override fun getName(): String {
        return delegate.name().removeSuffix(JvmAbi.DELEGATED_PROPERTY_NAME_SUFFIX)
    }

    override fun getDescriptorEvaluation(context: DebuggerContext?): PsiExpression? {
        return null
    }

    private fun findGetterForDelegatedProperty(): Method? {
        val fieldName = getName()
        if (!Name.isValidIdentifier(fieldName)) return null

        val getterName = PropertyCodegen.getterName(Name.identifier(fieldName))
        return getObject().referenceType().methodsByName(getterName)?.firstOrNull()
    }
}

