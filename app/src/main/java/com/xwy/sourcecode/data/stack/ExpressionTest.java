package com.xwy.sourcecode.data.stack;

/**
 * Created by xuweiyu on 2020/7/2.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ExpressionTest {
    public static void main(String[] args) {
        String[] data = {"4", "13", "5", "/", "+"};
        System.out.println(Expression.getExp(data));
    }
}
