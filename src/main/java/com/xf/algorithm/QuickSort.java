package com.xf.algorithm;

/**
 * Created by xufei on 2016/3/22.
 */
public class QuickSort {
    int[] temp = {1,2,3,6,8,5,4};

    public void handle(){
        quick_sort(temp,0,temp.length-1);
        for (int i:temp)
        System.out.println(i+" ");
    }
    //快速排序
    void quick_sort(int s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
    public static void main(String[] args) {
    new QuickSort().handle();
    }
}
