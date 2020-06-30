package com.xwy.sourcecode.data.circle;

/**
 * Created by xuweiyu on 2020/6/30.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class SingleCircleLinkedListTest {
    public static void main(String[] args) {
        SingleCircleLinkedList<Integer> linkedList = new SingleCircleLinkedList<>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(44);
        linkedList.add(0,55);
        linkedList.add(0,66);
        linkedList.remove(4);
        System.out.println(linkedList);
    }
}
