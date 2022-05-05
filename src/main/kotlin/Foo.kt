data class Foo(val bar: Baz)

data class Bar(val bar: Qux)

sealed class Baz {
    class One(val value: String) : Baz()

    object Two : Baz()
}

enum class Qux {
    ONE, TWO
}
