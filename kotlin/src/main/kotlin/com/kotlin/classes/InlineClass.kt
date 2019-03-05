@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package com.kotlin.classes

/**
 * Inline classes
 *
 * @author  Ivan on 2019-03-05 14:41.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * An inline class must have a single property initialized in the primary constructor. At runtime, instances of the inline class will be represented using this single property
 */
inline class Values(val value: String) {

    /**
     * - inline classes cannot have init blocks
     * - inline class properties cannot have backing fields
     *   - it follows that inline classes can only have simple computable properties (no lateinit/delegated properties)
     */
    val length: Int
        get() = value.length

    fun print() {
        println("hello, $value")
    }
}

interface Printable {
    fun prettyPrint() : String
}

/**
 * Inline classes are allowed to inherit from interfaces
 *
 * It is forbidden for inline classes to participate in a class hierarchy. This means that inline classes cannot extend other classes and must be final.
 */
inline class Name(val name: String) : Printable {
    override fun prettyPrint(): String {
        return "I'm $name"
    }
}

interface InlineClass

inline class Foo(val i: Int) : InlineClass

fun asInline(f: Foo) {}
fun <T> asGenerics(x: T) {}
fun asInterface(i: InlineClass) {}
fun asNullable(I : Foo?) {}

fun <T> id(x: T): T = x

fun main() {
    val value = Values("Kotlin")
    value.print()

    val name = Name("Bob")
    println(name.prettyPrint())

    val f = Foo(42)
    asInline(f)    // unboxed: used as Foo itself
    asGenerics(f)  // boxed: used as generic type
    asInterface(f) // boxed: used as Type InlineClass
    asNullable(f)  // boxed: used as Foo?

    // 'f' first is boxed (while being passed to 'id') and then unboxed (when returned from 'id')
    // In the end, 'c' contains unboxed representation (just '42'), as 'f'
    val c = id(f)
}