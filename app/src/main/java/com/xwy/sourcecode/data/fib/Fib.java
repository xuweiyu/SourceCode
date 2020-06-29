package com.xwy.sourcecode.data.fib;

/**
 * Created by xuweiyu on 2020/6/16.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Fib {
    public static int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            int first = 1;
            int second = 1;
            for (int i = 0; i < n - 1; i++) {
                second = first + second;
                first = second - first;
            }
            return second;
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
