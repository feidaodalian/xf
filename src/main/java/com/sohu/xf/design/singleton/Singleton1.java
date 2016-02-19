package com.sohu.xf.design.singleton;

/**
 * Created by feixu on 2016/2/1.
 *
 */
public final class Singleton1 {
    private Singleton1(){}
    private static Singleton1 singleton1=new Singleton1();
    public static Singleton1 getInstance(){
        return singleton1;
    }
}
