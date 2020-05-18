package com.xwy.sourcecode.map;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout6 {
    public static void main(String[] args) {
        ClassLayout layout = ClassLayout.parseInstance(new IJ());
        System.out.println(layout.toPrintable());
    }
}

class IJ {
    String str = "都那等你哦啊的大大所多";
    long i;
    long j = 100;
    long k = 1000;
}
