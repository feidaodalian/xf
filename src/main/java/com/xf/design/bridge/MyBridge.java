package com.xf.design.bridge;

/**
 * Created by feixu on 2016/2/23.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        Sourceable sourceable = new SourceSub1();
        bridge.setSource(sourceable);
        bridge.method();
        Sourceable sourceable2 = new SourceSub2();
        bridge.setSource(sourceable);
        bridge.method();
    }
}
