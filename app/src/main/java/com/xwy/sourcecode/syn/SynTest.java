package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：非同步修饰
 */
public class SynTest {
    public static void main(String[] args) {
        final SynTest test = new SynTest();
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

    private void method1() {
        System.out.println("method1 exe start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method1 exe end");
    }

    private void method2() {
        System.out.println("method2 exe start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method2 exe end");
    }
}
