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
        int n = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int[] param = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int max = getMaxLength(param);
        if (n == 2){
            System.out.println(max);
            return ;
        }
        if (param[0] != param[1] && param[0] == param[2]){
            swap(param, 0, 1);
            int num = getMaxLength(param);
            if (max < num){
                max = num;
            }
            swap(param, 0, 1);
        }
        if (param[n-2] != param[n-1] && param[n-1] == param[n-3]){
            swap(param, n-1, n-2);
            int num = getMaxLength(param);
            if (max < num){
                max = num;
            }
            swap(param, n-1, n-2);
        }
        for (int i = 1;i < param.length-2;i++){
            if (param[i] != param[i+1] && (param[i] == param[i+2] || param[i-1] == param[i+1])){
                swap(param, i, i+1);
                int num = getMaxLength(param);
                if (max < num){
                    max = num;
                }
                swap(param, i, i+1);
            }
        }

        System.out.println(max);
    }
    public static int getMaxLength(int[] param){
        int max = 0;
        int last = -1;
        int count = 0;
        for (int i : param){
            if (last == i){
                count++;
            }else{
                last = i;
                if (count > max) max = count;
                count = 1;
            }
        }
        if (count > max) max = count;
        return max;
    }
    public static void swap(int[] param, int i, int j){
        int temp1 = param[i];
        int temp2 = param[j];
        param[i] = temp2;
        param[j] = temp1;
    }
}

