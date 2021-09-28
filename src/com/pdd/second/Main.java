package com.pdd.second;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 19:48
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = s.charAt(0) - 48;
        System.out.println(s.substring(i));
    }

}

