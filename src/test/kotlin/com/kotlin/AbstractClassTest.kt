package com.kotlin

import com.kotlin.classes.*

/**
 * test class
 *
 * @author  Ivan on 2017/6/2 14:53.
 * @version v0.1
 * @since   v1.0
 *
 */
fun main(args : Array<String>) {
    val people = arrayOfNulls<People>(3)

    people[0] = American()
    people[1] = Chinese()
    people[2] = Japanese()

    for (p in people) {
        print(p?.nation + ": ")
        p?.sayHello()
        if (p is Genius) {
            p.showGift()
        }
        p?.sayGoodbye()
    }
}