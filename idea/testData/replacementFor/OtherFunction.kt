fun foo(p: Int){}
fun foo(p: String){}

@ReplacementFor("foo(p)")
fun bar(p: Int){}

fun foo() {
    foo(1)
    foo("1")
}