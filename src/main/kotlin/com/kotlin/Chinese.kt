package com.kotlin

/**
 * Chinese people
 *
 * @author  Ivan on 2017/6/2 12:04.
 * @version v0.1
 * @since   v1.0
 *
 */
class Chinese : People(), Genius {

    init {
        nation = "PRC"
    }

    override fun sayHello() {
        print("你好~😁 ")
    }

    override fun showGift() {
        print("I can do Chinese Kungfu. 🕺 ")
    }
}