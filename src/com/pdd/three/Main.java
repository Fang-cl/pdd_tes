package com.pdd.three;

import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 19:07
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] param = str2Arr(s);
        int num = Integer.parseInt(scanner.nextLine());
        String[] gz = new String[num];
        for (int i = 0;i < num;i++){
            gz[i] = scanner.nextLine();
        }






    }

    public static int[] str2Arr(String s){
        String[] split = s.substring(0, s.length() - 1).split(",");
        int[] arr = new int[split.length];
        for (int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(split[i]);
        }
        return arr;
    }

}
