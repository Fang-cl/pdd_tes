package com.pdd.first;

import java.util.*;

/**
 * @Author Fang
 * @create 2021/8/22 18:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int A = Integer.parseInt(s[0]);

        int count = 0;
        for (int i = 0;i <= A;i++){
            if (String.valueOf(i).contains(s[1])){
                count += getNum(i, s[1]);
            }
        }
        System.out.println(count);

    }
    public static int getNum(int i, String j){
        char[] chars = String.valueOf(i).toCharArray();
        char[] chars1 = j.toCharArray();
        int count = 0;
        for (int k = 0;k < chars.length;k++){
            if (chars[k] == chars1[0]){
                ++count;
            }
        }
        return count;
    }

}
