package com.xf.algorithm;

/**
 * Created by feixu on 2016/3/11.
 * 冒泡排序
 */
public class BubbleSort {
    public static void handle(int[] temp){
        int length = temp.length;
        for(int i=0;i<length;i++)
        for(int j=i+1;j<length;j++){
            int t = temp[i];
            if(t>temp[j]){
                temp[i] = temp[j];
                temp[j] = t;
            }
        }
      for(int a :temp)
          System.out.print(a+" ");
    }

    public static void main(String[] args) {
        handle(new int[]{2,1,3,4,1,222,13});
    }
}
