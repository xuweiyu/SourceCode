package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：yield方法测试
 */
public class ThreadTest8 {
    public static void main(String[] args) {
        new Thread("thread 1"){
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+" i = "+i);
                    Thread.yield();
                }
            }
        }.start();
        new Thread("thread 2"){
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+" i = "+i);
                    Thread.yield();
                }
            }
        }.start();
    }
}
