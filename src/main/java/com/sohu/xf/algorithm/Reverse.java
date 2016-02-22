package com.sohu.xf.algorithm;

/**
 * Created by xufei on 2016/2/23.
 */
public class Reverse {
   static void doReverse(char[] orgin){
       int l = orgin.length,j=l,i=l;

        while(l>0){
            if(orgin[l-1] ==' '){
                for(;j<i;j++){
                    System.out.print(orgin[j]);
                }
                i=l;
                j=l;
            }else{
                l--;j--;
            }

        }
    }
    public static void main(String[] args) {
       char[] words = {'h','e','l','l','o',' ','t','o','m',' ','a','n','d'};
        Reverse.doReverse(words);
    }
}
