package com.xf.design.factory;

/**
 * Created by feixu on 2016/2/18.
 */
public class MailSender implements ISender {
    public void send() {
        System.out.println("mail send !");
    }
}
