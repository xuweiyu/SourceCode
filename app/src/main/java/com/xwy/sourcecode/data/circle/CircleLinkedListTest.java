package com.xwy.sourcecode.data.circle;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class CircleLinkedListTest {
    public static void main(String[] args) {
        CircleLinkedList<Integer> linkedList = new CircleLinkedList<>();
        for (int i = 1; i <= 8; i++) {
            linkedList.add(i);
        }
        yueSeFu(linkedList);
    }

    private static void yueSeFu(CircleLinkedList<Integer> linkedList) {
        linkedList.reset();//将current指定到first
        while (!linkedList.isEmpty()) {
            //数三次,相当于向后移动个单元
            linkedList.next();
            linkedList.next();
            //删除
            linkedList.remove();
        }
    }
}
