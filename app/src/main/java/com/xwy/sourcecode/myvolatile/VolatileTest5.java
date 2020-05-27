package com.xwy.sourcecode.myvolatile;

/**
 * Created by xuweiyu on 2020/5/27.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class VolatileTest5 {
    public static void main(String[] args) {

    }

    static class Singleton {
        private static Singleton instance;

        private Singleton() {
            //do something
        }

        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
