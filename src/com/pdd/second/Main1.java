package com.pdd.second;

import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 20:35
 */
public class Main1 {
    static int i;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = arr;
        arr1[1] = 12;
        for (int i:arr){
            System.out.println(i);
        }
        System.out.println("===========");
        for (int i: arr1){
            System.out.println(i);
        }
    }

    public static int f(int i){
        if (i == 0) return 0;
        if (i == 1) return 1;
        return f(i-1) + f(i-2);
    }

}
