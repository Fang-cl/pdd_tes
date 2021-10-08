package com.pdd.second;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 19:48
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(jc(20));

    }
    public static String jc(int n){
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal result = new BigDecimal(0);
        for (int i = 1;i <=n;i++){
            bigDecimal = bigDecimal.multiply(new BigDecimal(i));
            result = result.add(bigDecimal);
        }

        return result.toString();
    }


}

