package com.pdd.first;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 18:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int x = Integer.parseInt(s[2]);

        String[] s1 = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        String[] s2 = scanner.nextLine().split(" ");
        int[] arr1 = Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();
        if (n == 1){
            for (int i = 0;i < arr1.length;i++){
                    System.out.print(i+1 + " ");
            }
            return ;
        }
        int max = 0;
        int pre = arr[0];
        int h = 0;
        for (int i = 1;i < arr.length;i++){
            h = arr[i] - pre;
            if (h < x && h > max){
                max = h;
                pre = i;
            }
        }
        pre = arr[arr.length-1];
        for (int i = arr.length-2;i >= 0;i--){
            h = arr[i] - pre;
            if (h < x && h > max){
                max = h;
                pre = i;
            }
        }
        h = Math.abs(arr[0] - arr[arr.length - 1]);
        if (h < x && h > max){
            max = h;
        }

        for (int i = 0;i < arr1.length;i++){
            if (arr1[i] > max){
                System.out.print(i+1 + " ");
            }
        }
    }

}
