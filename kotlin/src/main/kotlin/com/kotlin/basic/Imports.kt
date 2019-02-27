package com.kotlin.basic

import java.util.concurrent.ConcurrentHashMap as CMap

/**
 * imports
 *
 * @author  Ivan on 2019-02-27 18:20.
 * @version v0.1
 * @since   v1.0
 *
 */

fun main() {
    val map: CMap<String, String> = CMap(10)
    println(map.size)
}