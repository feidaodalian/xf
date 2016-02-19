package com.sohu.xf.design.factory;

/**
 * Created by feixu on 2016/2/18.
 */
//简单工厂
 class SimpleSendFactory {
    public ISender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }
        return null;
    }

    public static void main(String[] args) {
        ISender produce = new SimpleSendFactory().produce("mail");
        produce.send();
    }
}
//多方法工厂
 class SomeMethodSendFactory {
    public ISender mailProduce(){
            return new MailSender();
    }
    public ISender smsProduce(){
            return new SmsSender();
    }

    public static void main(String[] args) {
        ISender mail = new SomeMethodSendFactory().mailProduce();
        mail.send();
        ISender sms = new SomeMethodSendFactory().smsProduce();
        sms.send();
    }
}
//静态工厂
class StaticSendFactory {
    public static ISender mailProduce(){
            return new MailSender();
    }
    public static ISender smsProduce(){
            return new SmsSender();
    }

    public static void main(String[] args) {
        ISender mail = StaticSendFactory.mailProduce();
        mail.send();
        ISender sms = StaticSendFactory.smsProduce();
        sms.send();
    }

}



interface Provider{
    ISender prodouce();
}
class SmsSendFactory implements Provider{
    public ISender prodouce() {
        return new SmsSender();
    }
}
class MailSendFactory implements Provider{
    public ISender prodouce() {
        return new MailSender();
    }

    public static void main(String[] args) {
        Provider mailFactory = new MailSendFactory();
        ISender mail = mailFactory.prodouce();
        mail.send();
    }
}