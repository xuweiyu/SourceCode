package com.xwy.sourcecode.data.list;

import com.xwy.sourcecode.data.Person;

/**
 * Created by xuweiyu on 2020/6/20.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("张三",99));
        arrayList.add(new Person("李四",88));
        arrayList.add(new Person("王五",77));
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList.indexOf(null));
    }
}
