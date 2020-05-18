package com.xwy.sourcecode.concurrent;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：可见性
 */
public class Concurrent2 {
//    volatile static boolean ready = false;
    static boolean ready = false;
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("线程1开始执行");
                while (!ready){

                }
                System.out.println("线程1开始完毕");
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("线程2开始执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ready = true;
                System.out.println("线程2执行完毕");
            }
        }.start();
    }
}
