package com.xwy.sourcecode.map;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout5 {
    static ThreadLock lock = new ThreadLock();

    public static void main(String[] args) {
        System.out.println("hashCode = " + lock.hashCode());
        ClassLayout classLayout = ClassLayout.parseInstance(lock);
        System.out.println(classLayout.toPrintable());
    }
}

class ThreadLock {
    boolean lock;
    public long age;
    Student student = new Student();
}

class Student {
    String name = "张三";
    boolean gender;
}
