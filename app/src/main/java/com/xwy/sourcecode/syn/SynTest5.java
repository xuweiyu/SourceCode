package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SynTest5 {
    public static void main(String[] args) {
        final SynTest5 test5 = new SynTest5();
        new Thread(){
            @Override
            public void run() {
                super.run();
                test5.method2();
            }
        }.start();
    }
    private static synchronized void method1() {
        System.out.println("method1 exe start");
        try {
            System.out.println("method1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method1 exe end");
    }

    private synchronized void method2() {
        System.out.println("method2 exe start");
        try {
            method1();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method2 exe end");
    }
}
