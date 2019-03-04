package com.kotlin.classes

/**
 * Generics
 *
 * @author  Ivan on 2019-03-02 19:19.
 * @version v0.1
 * @since   v1.0
 *
 */

class Generic<T>(t: T) {
    val value = t
}

interface Source<out T> {
    fun nextT(): T
}

fun outFoo(src: Source<String>) {
    val obj: Source<Any> = src
}

interface Comparable<in T> {
    operator fun compareTo(other: T) : Int
}

fun inFoo(n: Comparable<Number>) {
    n.compareTo(1.0)
    val y: Comparable<Double> = n
}

/**
 * Generic functions
 */
fun <T> singletonList(item: T): List<T> {
    //...
    return emptyList()
}

/**
 * Upper bounds, corresponds to Java's extends keyword:
 */
fun <T: Comparable<T>> sort(list: List<T>) {
    //...
}

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
    where T : CharSequence,
          T: Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}

fun main() {
    val generic: Generic<Int> = Generic(1)
}