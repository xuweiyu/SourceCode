package com.xwy.sourcecode.syn;

/**
 * Created by xuweiyu on 2020/5/18.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SynTest8 {
    public static void main(String[] args) {
//        Syn syn = new Syn();
//        syn.test();
        SynMethod method = new SynMethod();
        method.test();
    }
}

class Syn {
    void test() {
        synchronized (this) {
            System.out.println("测试同步");
        }
    }
}

class SynMethod {
    public synchronized void test() {
        System.out.println("测试同步方法");
    }
}
