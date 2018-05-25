package com.learning.observer.v1;

/**
 * Subject
 *
 * @author  Ivan on 2018-05-24 23:13.
 * @version v0.1
 * @since   v1.0
 */
public interface Subject<T> {

    void registerObserver(Observer<T> observer);

    void unregisterObserver(Observer<T> observer);

    void notifyObserves();
}
