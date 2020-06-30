package com.xwy.sourcecode.data.circle;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class CircleLinkedListTest {
    public static void main(String[] args) {
        CircleLinkedList<Integer> linkedList = new CircleLinkedList<>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(44);
        linkedList.add(0, 55);
        linkedList.add(0, 66);
        linkedList.remove(linkedList.size()-1);
        linkedList.remove(0);
        System.out.println(linkedList);
    }
}
