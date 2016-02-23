package com.xf.design.singleton;

/**
 * Created by feixu on 2016/2/1.
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton2;
    private static Singleton2 getInstance(){
        if(singleton2==null){
        synchronized(Singleton2.class){
        if(singleton2==null){
            singleton2 = new Singleton2();
        }
        }}
        return singleton2;
    }
}
