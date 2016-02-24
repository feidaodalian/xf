package com.xf.algorithm;

/**
 * Created by xufei on 2016/2/23.
 * 求最大子数组
 */
public class MaxSonArray {
    public static void handle(int a[]){
        int length = a.length;
        int max = 0,sum=0;
        for(int i=0;i<length;i++){
            sum=0;
            for(int j=i;j<length;j++){
              sum+=a[j];
                if(sum>max){
                    max = sum;
                }
            }

        }
        System.out.println(max);
    }
    public static void handle2(int a[]){
        int max=a[0],temp=a[0],length=a.length;
        for(int i=1;i<length;i++){
                temp+=a[i];
                if(max<temp&&max>0){
                    max = temp;
                }else if(max<0&&temp<0){
                    temp = 0;
                }
            }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int a[]={33,2,-100,3,111,-90,0,22,2,99,-9,100,33,1111,333,0,-99,-1000,88888};
         handle2(a);
    }
}
