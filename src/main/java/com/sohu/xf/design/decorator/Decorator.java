package com.sohu.xf.design.decorator;


/**
 * Created by xufei on 2016/2/22.
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    public void method() {

        System.out.println("...before....");
        sourceable.method();
        System.out.println(".....after...");
    }

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable sourceable = new Decorator(source);
        sourceable.method();
    }
}
