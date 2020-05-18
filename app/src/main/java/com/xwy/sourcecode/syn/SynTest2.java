package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：静态方法
 */
public class SynTest2 {
    public static void main(String[] args) {
        final SynTest2 test = new SynTest2();
        new Thread() {
            @Override
            public void run() {
                super.run();
                test.method1();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                test.method2();
            }
        }.start();
    }

    private static synchronized void method1() {
        System.out.println("method1 exe start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method1 exe end");
    }

    private static synchronized void method2() {
        System.out.println("method2 exe start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method2 exe end");
    }
}
