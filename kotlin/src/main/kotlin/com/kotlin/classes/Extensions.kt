package com.kotlin.classes

/**
 * Kotlin, similar to C# and Gosu, provides the ability to extend a class with new functionality without
 * having to inherit from the class or use any type of design pattern such as Decorator. This is done via
 * special declarations called extensions. Kotlin supports extension functions and extension properties.
 *
 * @author  Ivan on 2019-03-01 10:04.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * Extension Functions
 */
fun <E> MutableList<E>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

/**
 * Extensions are resolved statically
 */
open class A

class B : A()

fun A.foo() {
    println("A.foo()")
}

fun B.foo() {
    println("B.foo")
}

/**
 * extension function being called is determined by the type of the expression on which the function is
 * invoked, not by the type of the result of evaluating that expression at runtime.
 */
fun printFoo(a: A) {
    a.foo() // whatever type A is, it prints "A.foo()"
}

/***************************************************************************************************/

/**
 * If a class has a member function, and an extension function is defined which has the same receiver type,
 * the same name is applicable to given arguments, the member always wins.
 *
 * this means you cannot change the original implemention of a function by adding extension funtions which has
 * the same name.
 */
class D {
    fun foo() {
        println("member fun foo()")
    }
}

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
fun D.foo() {
    println("extension fun foo()")
}

/***************************************************************************************************/

/**
 * Nullable Receiver
 */
fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}

/***************************************************************************************************/

/**
 * Extension Properties
 */
val <E> List<E>.lastIndex: Int
    get() = size - 1

/***************************************************************************************************/

/**
 * Companion Object Extension
 */
class E {
    companion object {}
}

fun E.Companion.foo() {
    println("extension for companion object")
}

/***************************************************************************************************/

/**
 * Declaring Extensions as Members
 */
class DD {
    fun fd() {
    }
}

class CC {
    fun fc() {

    }

    fun DD.foo() {
        fd() // calls DD.fd()
        fc() // calls CC.fc()

        hashCode() //calls DD.hashCode()
        this@CC.hashCode() // calls CC.hashCode()
    }

    fun calller(dd: DD) {
        dd.foo() // calls extension function foo()
    }
}

open class AA

class AA1 : AA()

open class BB {
    open fun AA.foo() {
        println("AA.foo() in BB")
    }

    open fun AA1.foo() {
        println("AA1.foo() in BB")
    }

    open fun caller(aa: AA) {
        aa.foo()
    }
}

class BB1 : BB() {

    override fun AA.foo() {
        println("AA.foo() in BB1")
    }

    override fun AA1.foo() {
        println("AA1.foo() in BB1")
    }

}

fun main() {

    val list = mutableListOf<Int>(1, 2, 3, 4, 6, 5)
    println("$list")
    list.swap(4, 5)
    println("$list")

    printFoo(B()) // prints "A.foo"

    D().foo() // prints "member fun foo()"

    BB().caller(AA()) // AA.foo() in BB
    BB1().caller(AA()) // AA.foo() in BB1
    BB1().caller(AA1()) // associate with type not specific instance, prints "AA.foo() in BB1"

}