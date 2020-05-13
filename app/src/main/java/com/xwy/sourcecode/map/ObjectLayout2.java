package com.xwy.sourcecode.map;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout2 {
    public static void main(String[] args) {
        ClassLayout classLayout = ClassLayout.parseClass(C.class);
        System.out.println(classLayout.toPrintable());
    }
}
class C{
    int i;
    long j;
}
