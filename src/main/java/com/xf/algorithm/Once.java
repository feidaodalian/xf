package com.xf.algorithm;

/**
 * Created by feixu on 2016/3/11.
 * 求数组中出现一次的数据
 */
public class Once {
    public static void handle(int[] temp){
        int length = temp.length;

        for(int i=0;i<length;i++){
            int flag = 0;
            for(int j=0;j<length;j++){
                if(temp[i]==temp[j]){
                    flag++;
                }
            }
            if(flag==1){
                System.out.printf(temp[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        handle(new int[]{1,2,3,4,5,4,3,2,21,1,1,1,4});
    }
}
