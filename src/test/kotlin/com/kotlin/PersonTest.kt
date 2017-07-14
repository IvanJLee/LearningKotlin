package com.kotlin

import com.kotlin.classes.Person

/**
 * person test
 *
 * @author  Ivan on 2017/6/2 14:55.
 * @version v0.1
 * @since   v1.0
 *
 */

fun main(args : Array<String>) {
    Person("Jack").greet()
    Person(20).greet()
    Person(60.0F).greet()
}