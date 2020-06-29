package com.xwy.sourcecode.data;

/**
 * Created by xuweiyu on 2020/6/29.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize exe:"+this);
    }
}
