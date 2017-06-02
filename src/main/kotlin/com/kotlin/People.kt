package com.kotlin

/**
 * people object
 *
 * @author  Ivan on 2017/6/2 12:01.
 * @version v0.1
 * @since   v1.0
 *
 */
abstract class People {

    var nation = ""

    abstract fun sayHello()

    open fun sayGoodbye() {
        println("Bye bye.")
    }
}