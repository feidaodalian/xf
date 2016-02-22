package com.sohu.xf.algorithm;

/**
 * Created by xufei on 2016/2/22.
 * n的阶层
 */
public class Stratum {
    public static void printStratum1(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            count=count*i;
        }
        System.out.println(count);
    }
    public static int printStratum3(int n){
        if(n==0){
            return 1;
        }
        return n*printStratum3(n-1);
    }
    public static void printStratum2(int n){
        int count=1;
        for(int i=n;i>0;i--){
            count=count*i;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        printStratum2(5);
        System.out.println("print3==>"+printStratum3(5));
        printStratum1(5);
    }
}
