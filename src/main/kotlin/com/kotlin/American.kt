package com.kotlin

/**
 * American
 *
 * @author  Ivan on 2017/6/2 14:34.
 * @version v0.1
 * @since   v1.0
 *
 */

class American : People(), Genius {
    init {
        nation = "USA"
    }

    override fun sayHello() {
        print("Hey man, how's it going？")
    }

    override fun showGift() {
        print("I am good at basketball. 🏀 ")
    }
}