package com.xf.design.adapter;

/**
 * Created by feixu on 2016/2/18.
 * 对象适配器
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source=source;
    }
    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public static void main(String[] args) {
        Source source =new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
