package com.pdd.three;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 19:07
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getDays(1998, 8, 21));
    }

    public static int getDays(int year, int month, int day){
        int result = 0;
        int temp = 0;
        for (int i = 1;i < month;i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:{
                    temp = 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11:{
                    temp = 30;
                    break;
                }
                case 2:{
                    if ((year % 100 !=0 &&year % 4 == 0) || (year % 100 == 0 && year%400==0)) {
                        temp = 29;
                    } else {
                        temp = 28;
                    }
                }
                default:{
                    break;
                }
            }
            result += temp;
        }
        return result + day;
    }
}
