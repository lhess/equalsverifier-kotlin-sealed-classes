import org.junit.jupiter.api.Test

import nl.jqno.equalsverifier.EqualsVerifier

internal class EqualsverifierTest {
    @Test
    fun sealedClassDemo() {
        EqualsVerifier.forClass(Foo::class.java).verify()
    }

    @Test
    fun enumDemo() {
        EqualsVerifier.forClass(Bar::class.java).verify()
    }
}
