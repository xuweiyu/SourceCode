package com.xwy.sourcecode.classlayout;

import org.openjdk.jol.info.ClassLayout;

/**
 * Created by xuweiyu on 2020/5/13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ObjectLayout4 {
    public static void main(String[] args) {
        Empty empty = new Empty();
        ClassLayout classLayout = ClassLayout.parseInstance(empty);
        System.out.println(classLayout.toPrintable());
    }


}
class Empty{

}
