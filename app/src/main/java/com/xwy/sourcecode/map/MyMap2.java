package com.xwy.sourcecode.map;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by xuweiyu on 2020/5/28.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class MyMap2 {
    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap<>(11);
        printCapacity(map);
        for (int i = 0; i < 12; i++) {
            map.put("name"+i,new Person("name"+i,i*2));
        }
        printCapacity(map);
        map.put("name",new Person("name",10));
        printCapacity(map);
    }

    private static void printCapacity(HashMap<? extends Object, ? extends Object> map){
        try {
            Method method = map.getClass().getDeclaredMethod("capacity");
            method.setAccessible(true);
            System.out.println("map集合的size = "+map.size()+", 数组容量 = "+method.invoke(map));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
