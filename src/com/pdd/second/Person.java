package com.pdd.second;

import java.io.Serializable;

/**
 * @Author Fang
 * @create 2021/9/24 9:02
 */
public class Person implements Serializable {
    private transient Integer age;
    private String name;
    private boolean b;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", b=" + b +
                '}';
    }


}
