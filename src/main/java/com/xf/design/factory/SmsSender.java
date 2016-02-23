package com.xf.design.factory;

/**
 * Created by feixu on 2016/2/18.
 */
public class SmsSender implements ISender {
    public void send() {
        System.out.println("sms send !");
    }
}
