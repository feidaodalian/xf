package com.sohu.xf.design.adapter;

/**
 * Created by feixu on 2016/2/18.
 */
public class SourceSub1 extends Wrapper2 {
    @Override
    public void method2() {
        super.method2();
        System.out.println("the sourceable interface's second Sub2!");
    }

    public static void main(String[] args) {
        Sourceable souceable = new SourceSub1();
        souceable.method2();
    }
}
