package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：同步代码块
 */
public class SynTest3 {
    public static void main(String[] args) {
        final SynTest3 test = new SynTest3();
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
        synchronized (this){
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
        synchronized (this){
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
