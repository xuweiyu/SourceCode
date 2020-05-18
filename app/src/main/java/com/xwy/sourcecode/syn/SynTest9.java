package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SynTest9 {
    static int count = 10;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    add();
                    System.out.println(count);
                }
            }.start();
        }
    }

    private static synchronized void add() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }
}
