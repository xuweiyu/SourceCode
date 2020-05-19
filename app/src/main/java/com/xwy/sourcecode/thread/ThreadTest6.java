package com.xwy.sourcecode.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ThreadTest6 {
    static int count = 0;

    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    count++;
                    System.out.println("count = " + count);
                    if (count == 5) {
                        countDownLatch.countDown();
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("count = 5线程2结束");
            }
        }.start();
    }
}
