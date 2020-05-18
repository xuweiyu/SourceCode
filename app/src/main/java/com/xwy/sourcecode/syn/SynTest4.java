package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SynTest4 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                SynTest4 test4 = new SynTest4();
                test4.method1();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                SynTest4 test4 = new SynTest4();
                test4.method2();
            }
        }.start();
    }

    private void method1() {
        System.out.println("method1 exe start");
        synchronized (this) {
            try {
                Thread.sleep(3000);
                System.out.println("method1 execute");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("method1 exe end");
    }

    private void method2() {
        System.out.println("method2 exe start");
        synchronized (this) {
            try {
                Thread.sleep(1000);
                System.out.println("method2 execute");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("method2 exe end");
    }
}
