package com.kotlin.basic

/**
 * Control Flow: if, when, for, while
 *
 * @author  Ivan on 2019-02-27 18:24.
 * @version v0.1
 * @since   v1.0
 *
 */

// If expression
fun ifExpression() {

    val a = 1
    val b = 10
    var c = 100

    // traditional usage
    var max = a
    if (a < b) max = b
    println(max)

    //as expression
    val maxVal = if (a < b) b else a
    println(maxVal)

    //if branches can be blocks, and the last expression is the value of a block:
    val maxV = if (a > b) {
        c++
        println("c in if expression: $c")
        a
    } else {
        c++
        println("c in else expression: $c")
        b
    }
    println(maxV)
 }

// When expression
fun whenExp(x: Any): Unit {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3, 4 -> print("x == 3 or x == 4")
        else -> { // Note the block
            print("x is neither 1 nor 2, x == $x")
        }
    }
}

//For loops
fun forLoops() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    for (i in list) println(i)

    for (i in 1..10) println(i)

    for (i in 10 downTo 1 step 2) println(i)

    val array = arrayOf(1, 2, 3, 4, 5)
    for (i in array.indices) println(i)

    for ((index, value) in array.withIndex()) println("$index, $value")
}

//while Loops
fun whileLoops() {
    var x = 10
    while (x > 0) {
        x--
    }

    x = 10
    do {
        x--
    } while (x > 1)
}

fun main() {
    ifExpression()
}
