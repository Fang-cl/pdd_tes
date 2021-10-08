package com.pdd.second;

import java.util.Scanner;

/**
 * @Author Fang
 * @create 2021/8/22 20:35
 */
public class Main1 {
    public static void main(String[] args) {
        Parent p = new child();
        p.print();

    }



}
class Parent{
    int num = 1;
    void print(){
        System.out.println("fu");
    }
}
class child extends Parent{
    int num = 2;
    void print(){
        System.out.println("child");
    }
    void otherPrint(){
        System.out.println("1");
    }
}
