package com.xwy.sourcecode.map;

import java.util.HashMap;

/**
 * Created by xuweiyu on 2020/5/27.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class MyMap extends Object{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"张三");
        System.out.println(map.get(null));
        map.put(null,"李四");
        System.out.println(map.get(null));
        map.put(null,null);
        System.out.println(map.get(null));
    }
}
