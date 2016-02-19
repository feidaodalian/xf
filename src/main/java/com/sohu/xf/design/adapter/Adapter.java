package com.sohu.xf.design.adapter;

/**
 * Created by feixu on 2016/2/18.
 * 类适配器
 */
public class Adapter extends Source implements Targetable {
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
