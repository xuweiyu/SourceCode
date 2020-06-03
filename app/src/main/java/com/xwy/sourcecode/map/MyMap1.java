package com.xwy.sourcecode.map;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuweiyu on 2020/5/28.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class MyMap1 {
    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap<>();
        map.put("张三", new Person("张三", 11));
        map.put("李四", new Person("李四", 13));
        map.put("王五", new Person("王五", 16));
        System.out.println("map的元素个数 = " + map.size());
        try {
            Method method = map.getClass().getDeclaredMethod("capacity");
            method.setAccessible(true);
            System.out.println("数组容量 = "+method.invoke(map));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
