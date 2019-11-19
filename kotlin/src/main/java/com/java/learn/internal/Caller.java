package com.java.learn.internal;

/**
 * com.java.learn
 *
 * @author Ivan on 2019-11-19
 * @version v0.1
 * @since v1.0
 **/
public class Caller {

    public void call(Callback callback) {
        if (callback != null) {
            callback.test();
        }
    }
}
