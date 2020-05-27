package com.xwy.sourcecode.myvolatile;

/**
 * Created by xuweiyu on 2020/5/26.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class VolatileTest {
    static boolean flag = false;
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("线程1开始执行");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (!flag){

                }
                System.out.println("线程1执行完毕");
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("线程2开始执行");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = true;
                System.out.println("线程2执行完毕");
            }
        }.start();
    }
}
