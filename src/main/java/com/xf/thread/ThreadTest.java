package com.xf.thread;

/**
 * Created by feixu on 2016/3/15.
 */
public class ThreadTest implements Runnable{
    int sum;

    public void run() {
        synchronized (this){
        sum++;
        System.out.println(sum);}
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        for (int i=0;i<50;i++){
        Thread thread = new Thread(test);
        thread.start();
        }

    }
}
