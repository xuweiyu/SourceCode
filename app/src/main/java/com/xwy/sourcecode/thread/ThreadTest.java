package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：wait方法
 */
public class ThreadTest {
    public static void main(String[] args) {
        final ThreadTest threadTest = new ThreadTest();
        new Thread() {
            @Override
            public void run() {
                super.run();
                threadTest.testWait();
            }
        }.start();
    }

    private synchronized void testWait() {
        System.out.println("testWait start time = " + System.currentTimeMillis());
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testWait end   time = " + System.currentTimeMillis());
    }
}
