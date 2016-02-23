package com.sohu.xf.design.bridge;


/**
 * Created by feixu on 2016/2/23.
 */
public abstract class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }
    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
