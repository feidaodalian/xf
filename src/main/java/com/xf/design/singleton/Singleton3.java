package com.xf.design.singleton;

/**
 * Created by feixu on 2016/2/1.
 */
public class Singleton3 {
    private Singleton3(){}
    private static class SingletonStatic{
        private static Singleton3 singleton3 = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return SingletonStatic.singleton3;
    }
}
