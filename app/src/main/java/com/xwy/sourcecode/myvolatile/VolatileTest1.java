package com.xwy.sourcecode.myvolatile;

/**
 * Created by xuweiyu on 2020/5/26.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class VolatileTest1 {
    static volatile int count = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    for (int j = 0; j < 10000; j++) {
                        count++;
                    }
                }
            }.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count = " + count);
    }
}
