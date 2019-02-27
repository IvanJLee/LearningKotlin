package com.kotlin.basic

/**
 * Returns and Jumps
 *
 * @author  Ivan on 2019-02-27 18:42.
 * @version v0.1
 * @since   v1.0
 *
 */

fun foo(name: String?) {
    val s = name ?: return
    println(s)
}

// Break and Continue labels
fun breakAndContinue() {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i > j) {
                continue@loop
            }
        }
    }
}

// Return at labels
fun returnAtLabels() {
    listOf(1, 2, 3, 4, 5).forEach() lit@{
        if (it == 3) return@lit
        print(it)
    }
    println(" done with explicit label")

    listOf(1, 2, 3, 4, 5).forEach() {
        if (it == 3) return
        print(it)
    }
    println("never reached statement")
}

// Return with implicit label
fun returnWithLambda() {
    listOf(1, 2, 3, 4, 5).forEach() {
        if (it == 3) return@forEach
        print(it)
    }
    println(" done with forEach")
}

// Return with anoymous function
fun returnWithAnoymousFunction() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return
        print(value)
    })
    print(" done with anonymous function")
}

// Return nested lambda
fun returnWithNestedLambda() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach() {
            if (it == 3) return@loop
            print(it)
        }
    }
    print(" done with nested loop")
}

// Return value
fun fun2(x: Int): Int {
    val n = run a@{
        if (x < 0) return@a -1*x else return x
    }
    return n
}

fun returnValue() {
    println(fun2(-5)) // 5
    println(fun2(0))  // 0
    println(fun2(5))  // 5
}

fun main() {
//    foo(null)
//    returnAtLabels()
//    returnWithLambda()
//    returnWithAnoymousFunction()
//    returnWithNestedLambda()
//    returnValue()
}