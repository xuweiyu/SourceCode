package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        final Thread thread1 = new Thread("thread 1"){
            @Override
            public void run() {
                super.run();
                System.out.println("线程1开始执行");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1执行结束");
            }
        };
        Thread thread2 = new Thread("thread 1"){
            @Override
            public void run() {
                super.run();
                System.out.println("线程2开始执行");
                try {
                    Thread.sleep(1000);
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程2执行结束");
            }
        };
        thread1.start();
        thread2.start();
    }
}
