package com.kotlin.classes

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseWheelEvent
import java.util.function.Consumer

/**
 * Classes can be nested in other classes
 *
 * @author  Ivan on 2019-03-03 23:03.
 * @version v0.1
 * @since   v1.0
 *
 */

class OuterClass {

    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }

    inner class InnerClass {
        fun foo() = bar
    }

    fun foo(f: Function) {
        f.foo()
        f.foo1(bar)
    }
}

interface Function {
    fun foo()

    fun foo1(arg: Int)
}

fun main() {
    val v = OuterClass().InnerClass().foo()

    // Anonymous inner class instances are created using an object expression:
    Thread(object : Runnable {
        override fun run() {
            println(Thread.currentThread().name)
        }
    }).start()

    //If the object is an instance of a functional Java interface (i.e. a Java interface with a single abstract method),
    // you can create it using a lambda expression prefixed with the type of the interface
    val consumer = Consumer<Int>() { println("accept")}
    println(Thread.currentThread().name)
}