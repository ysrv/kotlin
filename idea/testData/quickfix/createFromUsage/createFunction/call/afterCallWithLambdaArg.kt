// "Create function 'foo'" "true"

class A<T>(val n: T) {
    fun foo(t: T, s: String, function: Function1<T, T>): A<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun test() {
    val a: A<Int> = A(1).foo(2, "2") { p: Int -> p + 1 }
}