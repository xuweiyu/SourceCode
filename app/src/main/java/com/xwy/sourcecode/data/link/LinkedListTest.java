package com.xwy.sourcecode.data.link;

/**
 * Created by xuweiyu on 2020/6/30.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            linkedList.add(i);
        }
        linkedList.remove(5);
        System.out.println(linkedList);
    }
}
