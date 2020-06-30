package com.xwy.sourcecode.data.link;

import com.xwy.sourcecode.data.List;
import com.xwy.sourcecode.data.Person;

/**
 * Created by xuweiyu on 2020/6/29.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(44);
        linkedList.add(55);
        linkedList.remove(5);
        System.out.println(linkedList);
    }
}
