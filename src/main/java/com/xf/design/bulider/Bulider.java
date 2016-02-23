package com.xf.design.bulider;

import com.xf.design.factory.ISender;
import com.xf.design.factory.MailSender;
import com.xf.design.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feixu on 2016/2/18.
 */
public class Bulider {
    private List<ISender> list = new ArrayList<ISender>();
    public void produceMailSender(int count){
        for(int i=0;i<count;i++){
            list.add(new MailSender());
        }
    }
    public void produceSmsSender(int count){
        for(int i=0;i<count;i++){
            list.add(new SmsSender());
        }
    }

    public static void main(String[] args) {
        Bulider bulider = new Bulider();
        bulider.produceMailSender(20);
        bulider.produceSmsSender(30);

    }
}
