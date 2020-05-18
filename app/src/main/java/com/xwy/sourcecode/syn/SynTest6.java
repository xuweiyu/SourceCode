package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：死锁
 */
public class SynTest6 {
    public static void main(String[] args) {
        final SynTest6 test1 = new SynTest6();
        final SynTest6 test2 = new SynTest6();
        new Thread() {
            @Override
            public void run() {
                super.run();
                test1.method(test1, test2);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                test1.method(test2, test1);
            }
        }.start();
    }

    private void method(Object lock1, Object lock2) {
        System.out.println("method1 exe start");
        synchronized (lock1) {
            try {
                System.out.println("method1 sleep1");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
                try {
                    System.out.println("method1 sleep2");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("method1 exe end");
    }
}
