package com.xwy.sourcecode.data.stack;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class BracketsTest {
    public static void main(String[] args) {
        System.out.println(Brackets.isEffect("()[]{}"));
        System.out.println(Brackets.isEffect("(()[]{})"));
        System.out.println(Brackets.isEffect("(()[]{}"));
    }
}
