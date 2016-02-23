package com.xf.design.observer;


/**
 * Created by feixu on 2016/2/23.
 */
public class MySubject extends AbstractSubject {
    public void operation(){
        System.out.println("update self!");
        notifyObservers();
    }

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
