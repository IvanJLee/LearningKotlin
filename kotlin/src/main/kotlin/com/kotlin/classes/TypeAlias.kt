package com.kotlin.classes

import java.io.File

/**
 * Type aliases provide alternative names for existing types. If the type name is too long you can introduce a different shorter name and use the new one instead.
 *
 * @author  lijun on 2019-03-05 11:33.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * shorten long generic types.
 */
typealias IntList = List<Int>
typealias FileTable<K> = MutableMap<K, MutableList<File>>

/**
 *  provide different aliases for function types
 */
typealias Handler = (Int, String, Any) -> Unit
typealias Predicate<T> = (T) -> Boolean

class AAA {
    inner class Inner
}

class BBB {
    inner class Inner
}

/**
 * have new names for inner and nested classes
 */
typealias AInner = AAA.Inner
typealias BInner = BBB.Inner


class TypeAlias {

    fun foo(predicate: Predicate<Int>) = predicate(10)
}

fun main() {
    val f : (Int) -> Boolean = {
        it > 0
    }
    println(TypeAlias().foo(f))

    val pre: Predicate<Int> = {
        it > 0
    }
    println(listOf(1, -2, 3, -4, 5).filter(pre))
}