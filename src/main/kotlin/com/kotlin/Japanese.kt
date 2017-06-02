package com.kotlin

/**
 * Japanese people
 *
 * @author  Ivan on 2017/6/2 12:05.
 * @version v0.1
 * @since   v1.0
 *
 */
class Japanese : People(), Genius {
    init {
        nation = "JP"
    }

    override fun sayHello() {
        print("こんにちは，東京からのです。")
    }

    override fun showGift() {
        print("柔道ができます。　👘 ")
    }
}