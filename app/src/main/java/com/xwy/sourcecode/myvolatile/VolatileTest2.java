package com.xwy.sourcecode.myvolatile;

/**
 * Created by xuweiyu on 2020/5/26.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class VolatileTest2 {
    static volatile int count = 0;
    public static void main(String[] args) {
        count++;
    }
}
