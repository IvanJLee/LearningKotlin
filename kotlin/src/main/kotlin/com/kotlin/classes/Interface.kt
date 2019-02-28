package com.kotlin.classes

/**
 * Interfaces
 *
 * @author  Ivan on 2019-02-28 19:49.
 * @version v0.1
 * @since   v1.0
 *
 */
interface Interface {

    val prop: Int // abstract

    fun foo()

    fun foo2() {
        println("optional body")
    }
}

class Impl : Interface {

    override val prop: Int
        get() = 10

    override fun foo() {
        println("Impl boby")
    }

}

interface InheritancedInterface: Interface {

    fun foo3()
}

// Interfaces Inheritance
data class AnotherImpl(override var prop: Int) : InheritancedInterface {
    override fun foo() {
        println("foo() in AnotherImpl")
    }

    override fun foo3() {
        println("foo3() in AnotherImpl")
    }
}

interface AnotherInterface {
    fun foo2() {}
}

// Resolving overriding conflicts
class Impl2 : Interface, AnotherInterface {
    override fun foo() {
        println("")
    }

    override val prop: Int = 20

    override fun foo2() {
        super<Interface>.foo2()
        super<AnotherInterface>.foo2()
    }
}

