package com.java.learn;

import com.java.learn.impl.JCallbackImpl;
import com.java.learn.internal.Caller;

/**
 * com.java.learn
 *
 * @author Ivan on 2019-11-19
 * @version v0.1
 * @since v1.0
 **/
public class JTester {

    public static void main(String[] args) {
        new Caller().call(new JCallbackImpl());
    }
}
