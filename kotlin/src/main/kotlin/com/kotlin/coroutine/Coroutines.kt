package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.concurrent.thread

/**
 * Coroutines
 *
 * @author  Ivan on 2019-03-05 16:11.
 * @version v0.1
 * @since   v1.0
 *
 */

class Coroutines {

    fun foo() = runBlocking {
        GlobalScope.launch {
            for (c in "Hello World! Kotlin, make the world a better place.") {
                delay(100)
                print(c)
            }
        }
        print("Coroutine: ")
        delay(5000)
    }
}

fun foo() {
    GlobalScope.launch {
        for (c in "Hello World! Kotlin, make the world a better place.") {
            delay(100)
            print(c)
        }
    }
    println("Coroutine:")
    Thread.sleep(5000)
}

fun join() = runBlocking {
    val job = GlobalScope.launch {
        for (c in "Hello World! Kotlin, make the world a better place.") {
            delay(100)
            print(c)
        }
    }
    println("Coroutine:")
    job.join()
}

fun structuredJoin() = runBlocking {
    launch {
        for (c in "Hello World! Kotlin, make the world a better place.") {
            delay(100)
            print(c)
        }
    }
    println("Structured concurrency：")
}

fun coroutineScope() = runBlocking {
    launch {
        delay(200)
        println("Task from runBlocking")
    }

    coroutineScope() {
        launch {
            delay(500)
            println("Task from nested launch")
        }

        delay(100)
        println("Task from coroutine scope")
    }

    println("corourine scope is over")

}

fun repeatC() = runBlocking {
    repeat(100_000) {
        launch {
            delay(1000)
            if (it % 50 == 0) println()
            print("🌝")
        }
    }
}

fun repeatT() = runBlocking {
    repeat(100_000) {
        thread {
            Thread.sleep(1000)
            if (it % 50 == 0) println()
            print("🌚")
        }
    }
}

fun main() {

//    foo()

//    Coroutines().foo()

//    join()

//    structuredJoin()

//    coroutineScope()

    repeatC()
//    repeatT()
}