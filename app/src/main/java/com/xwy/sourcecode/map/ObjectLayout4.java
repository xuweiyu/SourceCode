package com.xwy.sourcecode.map;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout4 {
    public static void main(String[] args) {
        A[] list = new A[10];
        ClassLayout classLayout = ClassLayout.parseInstance(list);
        System.out.println(classLayout.toPrintable());
    }
}
