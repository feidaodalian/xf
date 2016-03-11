package com.xf.algorithm;

/**
 * Created by xufei on 2016/2/23.
 * A B C 属于集合，计算出最大连续A+B=C
 */
public class AaddBequalC {
    public static void handle(int args[]){
        int sum = 0;
        int temp = 0;
        int length = args.length;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                temp= args[i]+args[j];
                if(temp>sum){
                    for(int m=j;m<length;m++){
                        if(temp == args[m]){
                            sum = temp;
                        }
                    }
                }
            }

        }
        System.out.println(sum);//n立方
    }

    public static void handle2(int[] args){
       int length = args.length;
        for(int i=length-1;i>0;i--){
            for(int j=i;j>2;j--){
                if(args[i]==(args[j-1]+args[j-2])){
                    System.out.println(args[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a={1,2,3,33,66,99,178};
        AaddBequalC.handle2(a);
    }
}
