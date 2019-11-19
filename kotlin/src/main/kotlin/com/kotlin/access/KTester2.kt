package com.kotlin.access

import com.java.learn.CallerProxy
import com.java.learn.internal.Caller
import com.kotlin.access.impl.KCallbackImpl

/**
 * com.kotlin.access
 *
 * @author Ivan on 2019-11-19
 * @version v0.1
 * @since   v1.0
 **/

fun main() {
    CallerProxy().call(KCallbackImpl())
}