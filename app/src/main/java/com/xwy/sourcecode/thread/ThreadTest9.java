package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ThreadTest9 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            Thread thread = new Thread("thread"+i){
                @Override
                public void run() {
                    super.run();
                    System.out.println(Thread.currentThread().getName()+" start execute");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" end   execute");
                }
            };
            thread.start();
        }
        System.out.println("main方法执行完毕");
    }
}
