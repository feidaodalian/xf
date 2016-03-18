package com.xf.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by feixu on 2016/2/25.
 */
public class ThreadInterrupted implements Runnable{
    private final Lock lock = new ReentrantLock();

    public   void run() {
//    public synchronized  void run() {
//        lock.lock();
//        lock.tryLock();
        try {
            lock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName()+".....start......");
            TimeUnit.SECONDS.sleep(3);
//            Thread.sleep(30000);
            System.out.println(Thread.currentThread().getName()+".....end......");

        } catch (InterruptedException e) {
            e.printStackTrace();

            System.out.println(Thread.currentThread().getName()+".....interrupted......");
        }finally {
            lock.unlock();

        }
    }
    public static void main(String[] args) {
   ThreadInterrupted a = new ThreadInterrupted();
   Thread thread1 = new Thread(a);
   Thread thread2 = new Thread(a);
    thread1.start();
        thread2.start();
        thread2.interrupt();
    }
}
