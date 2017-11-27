@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("RangesKt")

package kotlin.ranges

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.js.*
import kotlin.comparisons.*

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Byte): Boolean {
    return contains(value.toInt())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Byte): Boolean {
    return contains(value.toLong())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Byte): Boolean {
    return contains(value.toShort())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("doubleRangeContains")
public operator fun ClosedRange<Double>.contains(value: Byte): Boolean {
    return contains(value.toDouble())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("floatRangeContains")
public operator fun ClosedRange<Float>.contains(value: Byte): Boolean {
    return contains(value.toFloat())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Double): Boolean {
    return value.toIntExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Double): Boolean {
    return value.toLongExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Double): Boolean {
    return value.toByteExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Double): Boolean {
    return value.toShortExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("floatRangeContains")
public operator fun ClosedRange<Float>.contains(value: Double): Boolean {
    return contains(value.toFloat())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Float): Boolean {
    return value.toIntExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Float): Boolean {
    return value.toLongExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Float): Boolean {
    return value.toByteExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Float): Boolean {
    return value.toShortExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("doubleRangeContains")
public operator fun ClosedRange<Double>.contains(value: Float): Boolean {
    return contains(value.toDouble())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Int): Boolean {
    return contains(value.toLong())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Int): Boolean {
    return value.toByteExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Int): Boolean {
    return value.toShortExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("doubleRangeContains")
public operator fun ClosedRange<Double>.contains(value: Int): Boolean {
    return contains(value.toDouble())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("floatRangeContains")
public operator fun ClosedRange<Float>.contains(value: Int): Boolean {
    return contains(value.toFloat())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Long): Boolean {
    return value.toIntExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Long): Boolean {
    return value.toByteExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Long): Boolean {
    return value.toShortExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("doubleRangeContains")
public operator fun ClosedRange<Double>.contains(value: Long): Boolean {
    return contains(value.toDouble())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("floatRangeContains")
public operator fun ClosedRange<Float>.contains(value: Long): Boolean {
    return contains(value.toFloat())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Short): Boolean {
    return contains(value.toInt())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Short): Boolean {
    return contains(value.toLong())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Short): Boolean {
    return value.toByteExactOrNull().let { if (it != null) contains(it) else false }
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("doubleRangeContains")
public operator fun ClosedRange<Double>.contains(value: Short): Boolean {
    return contains(value.toDouble())
}

/**
 * Checks if the specified [value] belongs to this range.
 */
@kotlin.jvm.JvmName("floatRangeContains")
public operator fun ClosedRange<Float>.contains(value: Short): Boolean {
    return contains(value.toFloat())
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Int.downTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this, to.toInt(), -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Long.downTo(to: Byte): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong(), -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Byte.downTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt(), -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Short.downTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt(), -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Char.downTo(to: Char): CharProgression {
    return CharProgression.fromClosedRange(this, to, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Int.downTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this, to, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Long.downTo(to: Int): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong(), -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Byte.downTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Short.downTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Int.downTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Long.downTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this, to, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Byte.downTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Short.downTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Int.downTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this, to.toInt(), -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Long.downTo(to: Short): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong(), -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Byte.downTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt(), -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 * 
 * The [to] value has to be less than this value.
 */
public infix fun Short.downTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt(), -1)
}

/**
 * Returns a progression that goes over the same range in the opposite direction with the same step.
 */
public fun IntProgression.reversed(): IntProgression {
    return IntProgression.fromClosedRange(last, first, -step)
}

/**
 * Returns a progression that goes over the same range in the opposite direction with the same step.
 */
public fun LongProgression.reversed(): LongProgression {
    return LongProgression.fromClosedRange(last, first, -step)
}

/**
 * Returns a progression that goes over the same range in the opposite direction with the same step.
 */
public fun CharProgression.reversed(): CharProgression {
    return CharProgression.fromClosedRange(last, first, -step)
}

/**
 * Returns a progression that goes over the same range with the given step.
 */
public infix fun IntProgression.step(step: Int): IntProgression {
    checkStepIsPositive(step > 0, step)
    return IntProgression.fromClosedRange(first, last, if (this.step > 0) step else -step)
}

/**
 * Returns a progression that goes over the same range with the given step.
 */
public infix fun LongProgression.step(step: Long): LongProgression {
    checkStepIsPositive(step > 0, step)
    return LongProgression.fromClosedRange(first, last, if (this.step > 0) step else -step)
}

/**
 * Returns a progression that goes over the same range with the given step.
 */
public infix fun CharProgression.step(step: Int): CharProgression {
    checkStepIsPositive(step > 0, step)
    return CharProgression.fromClosedRange(first, last, if (this.step > 0) step else -step)
}

internal fun Int.toByteExactOrNull(): Byte? {
    return if (this in Byte.MIN_VALUE.toInt()..Byte.MAX_VALUE.toInt()) this.toByte() else null
}

internal fun Long.toByteExactOrNull(): Byte? {
    return if (this in Byte.MIN_VALUE.toLong()..Byte.MAX_VALUE.toLong()) this.toByte() else null
}

internal fun Short.toByteExactOrNull(): Byte? {
    return if (this in Byte.MIN_VALUE.toShort()..Byte.MAX_VALUE.toShort()) this.toByte() else null
}

internal fun Double.toByteExactOrNull(): Byte? {
    return if (this in Byte.MIN_VALUE.toDouble()..Byte.MAX_VALUE.toDouble()) this.toByte() else null
}

internal fun Float.toByteExactOrNull(): Byte? {
    return if (this in Byte.MIN_VALUE.toFloat()..Byte.MAX_VALUE.toFloat()) this.toByte() else null
}

internal fun Long.toIntExactOrNull(): Int? {
    return if (this in Int.MIN_VALUE.toLong()..Int.MAX_VALUE.toLong()) this.toInt() else null
}

internal fun Double.toIntExactOrNull(): Int? {
    return if (this in Int.MIN_VALUE.toDouble()..Int.MAX_VALUE.toDouble()) this.toInt() else null
}

internal fun Float.toIntExactOrNull(): Int? {
    return if (this in Int.MIN_VALUE.toFloat()..Int.MAX_VALUE.toFloat()) this.toInt() else null
}

internal fun Double.toLongExactOrNull(): Long? {
    return if (this in Long.MIN_VALUE.toDouble()..Long.MAX_VALUE.toDouble()) this.toLong() else null
}

internal fun Float.toLongExactOrNull(): Long? {
    return if (this in Long.MIN_VALUE.toFloat()..Long.MAX_VALUE.toFloat()) this.toLong() else null
}

internal fun Int.toShortExactOrNull(): Short? {
    return if (this in Short.MIN_VALUE.toInt()..Short.MAX_VALUE.toInt()) this.toShort() else null
}

internal fun Long.toShortExactOrNull(): Short? {
    return if (this in Short.MIN_VALUE.toLong()..Short.MAX_VALUE.toLong()) this.toShort() else null
}

internal fun Double.toShortExactOrNull(): Short? {
    return if (this in Short.MIN_VALUE.toDouble()..Short.MAX_VALUE.toDouble()) this.toShort() else null
}

internal fun Float.toShortExactOrNull(): Short? {
    return if (this in Short.MIN_VALUE.toFloat()..Short.MAX_VALUE.toFloat()) this.toShort() else null
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Int.until(to: Byte): IntRange {
    return this .. (to.toInt() - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Long.until(to: Byte): LongRange {
    return this .. (to.toLong() - 1).toLong()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Byte.until(to: Byte): IntRange {
    return this.toInt() .. (to.toInt() - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Short.until(to: Byte): IntRange {
    return this.toInt() .. (to.toInt() - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to `'\u0000'` the returned range is empty.
 */
public infix fun Char.until(to: Char): CharRange {
    if (to <= '\u0000') return CharRange.EMPTY
    return this .. (to - 1).toChar()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to [Int.MIN_VALUE] the returned range is empty.
 */
public infix fun Int.until(to: Int): IntRange {
    if (to <= Int.MIN_VALUE) return IntRange.EMPTY
    return this .. (to - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Long.until(to: Int): LongRange {
    return this .. (to.toLong() - 1).toLong()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to [Int.MIN_VALUE] the returned range is empty.
 */
public infix fun Byte.until(to: Int): IntRange {
    if (to <= Int.MIN_VALUE) return IntRange.EMPTY
    return this.toInt() .. (to - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to [Int.MIN_VALUE] the returned range is empty.
 */
public infix fun Short.until(to: Int): IntRange {
    if (to <= Int.MIN_VALUE) return IntRange.EMPTY
    return this.toInt() .. (to - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to [Long.MIN_VALUE] the returned range is empty.
 */
public infix fun Int.until(to: Long): LongRange {
    if (to <= Long.MIN_VALUE) return LongRange.EMPTY
    return this.toLong() .. (to - 1).toLong()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to [Long.MIN_VALUE] the returned range is empty.
 */
public infix fun Long.until(to: Long): LongRange {
    if (to <= Long.MIN_VALUE) return LongRange.EMPTY
    return this .. (to - 1).toLong()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to [Long.MIN_VALUE] the returned range is empty.
 */
public infix fun Byte.until(to: Long): LongRange {
    if (to <= Long.MIN_VALUE) return LongRange.EMPTY
    return this.toLong() .. (to - 1).toLong()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 * 
 * If the [to] value is less than or equal to [Long.MIN_VALUE] the returned range is empty.
 */
public infix fun Short.until(to: Long): LongRange {
    if (to <= Long.MIN_VALUE) return LongRange.EMPTY
    return this.toLong() .. (to - 1).toLong()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Int.until(to: Short): IntRange {
    return this .. (to.toInt() - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Long.until(to: Short): LongRange {
    return this .. (to.toLong() - 1).toLong()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Byte.until(to: Short): IntRange {
    return this.toInt() .. (to.toInt() - 1).toInt()
}

/**
 * Returns a range from this value up to but excluding the specified [to] value.
 */
public infix fun Short.until(to: Short): IntRange {
    return this.toInt() .. (to.toInt() - 1).toInt()
}

/**
 * Ensures that this value is not less than the specified [minimumValue].
 * 
 * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
 */
public fun <T: Comparable<T>> T.coerceAtLeast(minimumValue: T): T {
    return if (this < minimumValue) minimumValue else this
}

/**
 * Ensures that this value is not less than the specified [minimumValue].
 * 
 * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
 */
public fun Byte.coerceAtLeast(minimumValue: Byte): Byte {
    return if (this < minimumValue) minimumValue else this
}

/**
 * Ensures that this value is not less than the specified [minimumValue].
 * 
 * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
 */
public fun Short.coerceAtLeast(minimumValue: Short): Short {
    return if (this < minimumValue) minimumValue else this
}

/**
 * Ensures that this value is not less than the specified [minimumValue].
 * 
 * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
 */
public fun Int.coerceAtLeast(minimumValue: Int): Int {
    return if (this < minimumValue) minimumValue else this
}

/**
 * Ensures that this value is not less than the specified [minimumValue].
 * 
 * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
 */
public fun Long.coerceAtLeast(minimumValue: Long): Long {
    return if (this < minimumValue) minimumValue else this
}

/**
 * Ensures that this value is not less than the specified [minimumValue].
 * 
 * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
 */
public fun Float.coerceAtLeast(minimumValue: Float): Float {
    return if (this < minimumValue) minimumValue else this
}

/**
 * Ensures that this value is not less than the specified [minimumValue].
 * 
 * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
 */
public fun Double.coerceAtLeast(minimumValue: Double): Double {
    return if (this < minimumValue) minimumValue else this
}

/**
 * Ensures that this value is not greater than the specified [maximumValue].
 * 
 * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
 */
public fun <T: Comparable<T>> T.coerceAtMost(maximumValue: T): T {
    return if (this > maximumValue) maximumValue else this
}

/**
 * Ensures that this value is not greater than the specified [maximumValue].
 * 
 * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
 */
public fun Byte.coerceAtMost(maximumValue: Byte): Byte {
    return if (this > maximumValue) maximumValue else this
}

/**
 * Ensures that this value is not greater than the specified [maximumValue].
 * 
 * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
 */
public fun Short.coerceAtMost(maximumValue: Short): Short {
    return if (this > maximumValue) maximumValue else this
}

/**
 * Ensures that this value is not greater than the specified [maximumValue].
 * 
 * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
 */
public fun Int.coerceAtMost(maximumValue: Int): Int {
    return if (this > maximumValue) maximumValue else this
}

/**
 * Ensures that this value is not greater than the specified [maximumValue].
 * 
 * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
 */
public fun Long.coerceAtMost(maximumValue: Long): Long {
    return if (this > maximumValue) maximumValue else this
}

/**
 * Ensures that this value is not greater than the specified [maximumValue].
 * 
 * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
 */
public fun Float.coerceAtMost(maximumValue: Float): Float {
    return if (this > maximumValue) maximumValue else this
}

/**
 * Ensures that this value is not greater than the specified [maximumValue].
 * 
 * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
 */
public fun Double.coerceAtMost(maximumValue: Double): Double {
    return if (this > maximumValue) maximumValue else this
}

/**
 * Ensures that this value lies in the specified range [minimumValue]..[maximumValue].
 * 
 * @return this value if it's in the range, or [minimumValue] if this value is less than [minimumValue], or [maximumValue] if this value is greater than [maximumValue].
 */
public fun <T: Comparable<T>> T.coerceIn(minimumValue: T?, maximumValue: T?): T {
    if (minimumValue !== null && maximumValue !== null) {
        if (minimumValue > maximumValue) throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
        if (this < minimumValue) return minimumValue
        if (this > maximumValue) return maximumValue
    }
    else {
        if (minimumValue !== null && this < minimumValue) return minimumValue
        if (maximumValue !== null && this > maximumValue) return maximumValue
    }
    return this
}

/**
 * Ensures that this value lies in the specified range [minimumValue]..[maximumValue].
 * 
 * @return this value if it's in the range, or [minimumValue] if this value is less than [minimumValue], or [maximumValue] if this value is greater than [maximumValue].
 */
public fun Byte.coerceIn(minimumValue: Byte, maximumValue: Byte): Byte {
    if (minimumValue > maximumValue) throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
    if (this < minimumValue) return minimumValue
    if (this > maximumValue) return maximumValue
    return this
}

/**
 * Ensures that this value lies in the specified range [minimumValue]..[maximumValue].
 * 
 * @return this value if it's in the range, or [minimumValue] if this value is less than [minimumValue], or [maximumValue] if this value is greater than [maximumValue].
 */
public fun Short.coerceIn(minimumValue: Short, maximumValue: Short): Short {
    if (minimumValue > maximumValue) throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
    if (this < minimumValue) return minimumValue
    if (this > maximumValue) return maximumValue
    return this
}

/**
 * Ensures that this value lies in the specified range [minimumValue]..[maximumValue].
 * 
 * @return this value if it's in the range, or [minimumValue] if this value is less than [minimumValue], or [maximumValue] if this value is greater than [maximumValue].
 */
public fun Int.coerceIn(minimumValue: Int, maximumValue: Int): Int {
    if (minimumValue > maximumValue) throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
    if (this < minimumValue) return minimumValue
    if (this > maximumValue) return maximumValue
    return this
}

/**
 * Ensures that this value lies in the specified range [minimumValue]..[maximumValue].
 * 
 * @return this value if it's in the range, or [minimumValue] if this value is less than [minimumValue], or [maximumValue] if this value is greater than [maximumValue].
 */
public fun Long.coerceIn(minimumValue: Long, maximumValue: Long): Long {
    if (minimumValue > maximumValue) throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
    if (this < minimumValue) return minimumValue
    if (this > maximumValue) return maximumValue
    return this
}

/**
 * Ensures that this value lies in the specified range [minimumValue]..[maximumValue].
 * 
 * @return this value if it's in the range, or [minimumValue] if this value is less than [minimumValue], or [maximumValue] if this value is greater than [maximumValue].
 */
public fun Float.coerceIn(minimumValue: Float, maximumValue: Float): Float {
    if (minimumValue > maximumValue) throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
    if (this < minimumValue) return minimumValue
    if (this > maximumValue) return maximumValue
    return this
}

/**
 * Ensures that this value lies in the specified range [minimumValue]..[maximumValue].
 * 
 * @return this value if it's in the range, or [minimumValue] if this value is less than [minimumValue], or [maximumValue] if this value is greater than [maximumValue].
 */
public fun Double.coerceIn(minimumValue: Double, maximumValue: Double): Double {
    if (minimumValue > maximumValue) throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
    if (this < minimumValue) return minimumValue
    if (this > maximumValue) return maximumValue
    return this
}

/**
 * Ensures that this value lies in the specified [range].
 * 
 * @return this value if it's in the [range], or `range.start` if this value is less than `range.start`, or `range.endInclusive` if this value is greater than `range.endInclusive`.
 */
@SinceKotlin("1.1")
public fun <T: Comparable<T>> T.coerceIn(range: ClosedFloatingPointRange<T>): T {
    if (range.isEmpty()) throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    return when {
        // this < start equiv to this <= start && !(this >= start)
        range.lessThanOrEquals(this, range.start) && !range.lessThanOrEquals(range.start, this) -> range.start
        // this > end equiv to this >= end && !(this <= end)
        range.lessThanOrEquals(range.endInclusive, this) && !range.lessThanOrEquals(this, range.endInclusive) -> range.endInclusive
        else -> this
    }
}

/**
 * Ensures that this value lies in the specified [range].
 * 
 * @return this value if it's in the [range], or `range.start` if this value is less than `range.start`, or `range.endInclusive` if this value is greater than `range.endInclusive`.
 */
public fun <T: Comparable<T>> T.coerceIn(range: ClosedRange<T>): T {
    if (range is ClosedFloatingPointRange) {
        return this.coerceIn<T>(range)
    }
    if (range.isEmpty()) throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    return when {
        this < range.start -> range.start
        this > range.endInclusive -> range.endInclusive
        else -> this
    }
}

/**
 * Ensures that this value lies in the specified [range].
 * 
 * @return this value if it's in the [range], or `range.start` if this value is less than `range.start`, or `range.endInclusive` if this value is greater than `range.endInclusive`.
 */
public fun Int.coerceIn(range: ClosedRange<Int>): Int {
    if (range is ClosedFloatingPointRange) {
        return this.coerceIn<Int>(range)
    }
    if (range.isEmpty()) throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    return when {
        this < range.start -> range.start
        this > range.endInclusive -> range.endInclusive
        else -> this
    }
}

/**
 * Ensures that this value lies in the specified [range].
 * 
 * @return this value if it's in the [range], or `range.start` if this value is less than `range.start`, or `range.endInclusive` if this value is greater than `range.endInclusive`.
 */
public fun Long.coerceIn(range: ClosedRange<Long>): Long {
    if (range is ClosedFloatingPointRange) {
        return this.coerceIn<Long>(range)
    }
    if (range.isEmpty()) throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
    return when {
        this < range.start -> range.start
        this > range.endInclusive -> range.endInclusive
        else -> this
    }
}

