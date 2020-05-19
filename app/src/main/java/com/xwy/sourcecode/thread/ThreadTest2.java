package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：notify方法
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        final ThreadTest2 threadTest2 = new ThreadTest2();
        for (int i = 0; i < 5; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    threadTest2.testWait();
                }
            }.start();
        }
        synchronized (threadTest2) {
            threadTest2.notify();
        }
        try {
            //保证代码执行到此处线程都处于挂起状态
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (threadTest2) {
            threadTest2.notifyAll();
        }
    }

    private synchronized void testWait() {
        System.out.println("testWait start thread = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testWait end   thread = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
    }
}
