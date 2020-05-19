package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 在一个线程中将变量count从1加到10，当count等于5的时候在另一个线程中通知。
 * 简介：volatile的错误示范
 */
public class ThreadTest3 {
    static volatile int count = 0;

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 10; i++) {
                    count++;
                    System.out.println("count = " + count);
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (count < 5) {
                }
                System.out.println("count = 5线程2结束");
            }
        }.start();
    }
}
