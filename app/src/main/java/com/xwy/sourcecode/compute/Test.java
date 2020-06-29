package com.xwy.sourcecode.compute;

/**
 * Created by xuweiyu on 2020/6/10.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Test {
    public static void main(String[] args) {
        final int n = 45;
        TimeTool.check("fib1", new TimeTool.Task() {
            @Override
            public void execute() {
                fib1(n);
            }
        });
        TimeTool.check("fib2", new TimeTool.Task() {
            @Override
            public void execute() {
                fib2(n);
            }
        });
    }

    private static int fib1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    private static int fib2(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int first = 1;
            int second = 1;
            for (int i = 0; i < n - 1; i++) {
                int sum = first + second;
                first = second;
                second = sum;
            }
            return second;
        }
    }

    public static void test1(int n) {
        if (n==1) {
            System.out.println("n等于1");
        }else {
            System.out.println("n不等于1");
        }
    }

    public static void test2(int n) {
        while ((n = n / 2) > 0) {
            System.out.println(n);
        }
    }

    public static void test3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void test4(int n) {
        for (int i = 0; i < n; i += i) {
            for (int j = 0; j < i; j++) {
                System.out.println(i);
            }
        }
    }

    public static void test5(int n) {
        for (int i = 0; i < n; i += i) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i);
            }
        }
    }
}
