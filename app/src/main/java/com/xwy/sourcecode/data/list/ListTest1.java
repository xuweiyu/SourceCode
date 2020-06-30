package com.xwy.sourcecode.data.list;



/**
 * Created by xuweiyu on 2020/6/29.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> peoples = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            peoples.add(i);
        }
//        System.out.println(peoples);
        for (int i = 0; i < 49; i++) {
            peoples.remove(0);
        }
        System.out.println(peoples);
     }
}
