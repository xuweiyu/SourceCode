package com.xwy.sourcecode.classlayout;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout3 {
    public static void main(String[] args) {
        ClassLayout classLayout = ClassLayout.parseClass(E.class);
        System.out.println(classLayout.toPrintable());
    }
}

class D {
    int i;
}

class E extends D {
    long j;
}
