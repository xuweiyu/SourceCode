package com.xwy.sourcecode.myvolatile;

/**
 * Created by xuweiyu on 2020/5/26.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class VolatileTest4 {
    static volatile int a, b;
    static  int x, y;
    static int count;

    public static void main(String[] args) {
        while (true) {
           if (getStatus()){
               break;
           }
        }
        System.out.println("执行" + count + "次后x = 0而且y = 0");
    }
    private static boolean getStatus(){
        count++;
        a = 0; b =0;
        x = 0; y = 0;
        Thread t1 = new Thread() {
            @Override
            public void run() {
                super.run();
                a = 1;
                x = b;
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                super.run();
                b = 1;
                y = a;
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}
