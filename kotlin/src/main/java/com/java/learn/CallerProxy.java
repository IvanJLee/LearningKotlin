package com.java.learn;

import com.java.learn.internal.AbsCallback;
import com.java.learn.internal.Caller;

/**
 * com.java.learn
 *
 * @author lijun on 2019-11-19
 * @version v0.1
 * @since v1.0
 **/
public class CallerProxy {

    public void call(AbsCallback callback) {
        new Caller().call(callback);
    }
}
