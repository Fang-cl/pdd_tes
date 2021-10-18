package com.pdd.first;

import java.util.*;

/**
 * @Author Fang
 * @create 2021/8/22 18:51
 */
public class Main {
    static class Person{
        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
    static class Teacher extends Person{

    }
    public static void test1(Person person){
        System.out.println(person.getName());
    }
    public static void test2(Teacher teacher){
        System.out.println(teacher.getName());
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("人类");
        Teacher t = new Teacher();
        t.setName("许建秋");
        test1(p);
        test1(t);
        System.out.println("=================");
//        test2(p);
//        test2(t);

    }


}
