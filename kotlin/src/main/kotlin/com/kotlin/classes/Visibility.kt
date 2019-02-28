package com.kotlin.classes

/**
 * Visibility Modifiers
 *
 * @author  Ivan on 2019-02-28 20:06.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * default public
 */
fun topLevelFun() { }

/**
 * visible inside this file, Visibility.kt
 */
private fun privateFun() { }

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in Visiblity.kt

internal val baz = 6 // // visible inside the same module

/**
 * private means visible inside this class only (including all its members);
 * protected — same as private + visible in subclasses too;
 * internal — any client inside this module who sees the declaring class sees its internal members;
 * public — any client who sees the declaring class sees its public members.
 */
class Visibility {
}

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4 // public by default


    protected class Nested {
        public val e: Int = 5
        private val f = 6 // outer class does not see private members of its inner classes in Kotlin
    }
}

class Subclass: Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}

/**
 * To specify a visibility of the primary constructor of a class, use the following syntax (note that you need to add an explicit constructor keyword)
 */
class C private constructor(a: Int) { }