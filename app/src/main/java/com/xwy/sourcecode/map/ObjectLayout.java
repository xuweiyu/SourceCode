package com.xwy.sourcecode.map;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout {
    public static void main(String[] args) {
        ClassLayout classLayout = ClassLayout.parseClass(A.class);
        System.out.println("对象布局结构如下：");
        System.out.println(classLayout.toPrintable());
        A a = new A();
        a.i = 100;
        ClassLayout classLayout1 = ClassLayout.parseInstance(a);
        System.out.println("对象a布局结构如下：");
        System.out.println(classLayout1.toPrintable());
        A a1 = new A();
        a1.i = 1000000;
        ClassLayout classLayout2 = ClassLayout.parseInstance(a1);
        System.out.println("对象a1布局结构如下：");
        System.out.println(classLayout2.toPrintable());
    }
}

class A{
    long i;
}
