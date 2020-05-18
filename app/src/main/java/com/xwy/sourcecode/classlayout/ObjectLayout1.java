package com.xwy.sourcecode.classlayout;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout1 {
    public static void main(String[] args) {
        ClassLayout classLayout = ClassLayout.parseClass(B.class);
        System.out.println(classLayout.toPrintable());
        B b = new B();
        ClassLayout classLayout1 = ClassLayout.parseInstance(b);
        System.out.println(classLayout1.toPrintable());
    }
}
class B extends A{
    long j = 100;
    String str = "都那等你哦啊的大大所多";
    long k = 1000;
}
