package com.sohu.xf.design.proxy;

import com.sohu.xf.design.decorator.*;

/**
 * Created by xufei on 2016/2/22.
 */
public class Proxy implements Sourceable {
    private Sourceable sourceable;
    public Proxy(){
        super();
        this.sourceable=new Source();
    }
    public void method() {
        System.out.println("...before....");
        sourceable.method();
        System.out.println(".....after...");
    }

    public static void main(String[] args) {
        Sourceable proxy = new Proxy();
        proxy.method();
    }
}
