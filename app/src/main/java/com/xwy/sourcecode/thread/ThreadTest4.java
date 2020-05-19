package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ThreadTest4 {
    static int count = 0;

    public static void main(String[] args) {
        final ThreadTest4 lock = new ThreadTest4();
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(10);//保证线程2的wait执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    count++;
                    System.out.println("count = " + count);
                    if (count==5){
                        synchronized (lock){
                            lock.notify();
                        }
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                super.run();
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("count = 5线程2结束");
            }
        }.start();
    }
}
