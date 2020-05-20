package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：对比wait和sleep方法
 */
public class ThreadTest7 {
    public static void main(String[] args) {
        final ThreadTest7 threadTest7 = new ThreadTest7();
        for (int i = 0; i < 3; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    threadTest7.waitMethod();
                }
            }.start();
        }
        try {
            Thread.sleep(10000);//休眠10s等待wait执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    threadTest7.sleepMethod();
                }
            }.start();
        }
    }

    private synchronized void waitMethod() {
        System.out.println("waitMethod execute time = " + System.currentTimeMillis());
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void sleepMethod() {
        System.out.println("sleepMethod execute time = " + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
