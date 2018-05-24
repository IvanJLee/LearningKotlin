package com.learning.observer.v1;

/**
 * Observer
 *
 * @author  Ivan on 2018-05-24 23:15.
 * @version v0.1
 * @since   v1.0
 */
public interface Observer<T> {

    void onDataChange(T t);
}
