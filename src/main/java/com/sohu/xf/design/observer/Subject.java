package com.sohu.xf.design.observer;

/**
 * Created by feixu on 2016/2/23.
 */
public interface Subject {
    public void add(Observer observer);
    public void del(Observer observer);
    public void notifyObservers();
    public void operation();
}
