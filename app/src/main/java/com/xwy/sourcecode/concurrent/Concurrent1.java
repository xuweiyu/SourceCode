package com.xwy.sourcecode.concurrent;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：加锁保证共享变量的安全性
 */
public class Concurrent1 {
    static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    for (int j = 0; j < 100; j++) {
                        try {
                            //增大共享变量被多个线程交替修改的概率
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        add();
                    }
                }
            }.start();
        }
        try {
            //休眠保证线程执行完毕
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

    private static synchronized void add(){
        count++;
    }
}
