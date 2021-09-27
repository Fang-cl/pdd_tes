package com.pdd.first;


import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 18:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        for (int i = 0;i < K;i++){
            String[] s1 = scanner.nextLine().split(" ");
            int first = Integer.parseInt(s1[0]);
            int second = Integer.parseInt(s1[1]);
            if (X == first) X = second;
            else if (X == second) X = first;
        }
        System.out.println(X);

    }

}
