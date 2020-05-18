package com.xwy.sourcecode.classlayout;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuweiyu on 2020-04-13.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class HashMapClient {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put(null,"张三");
        System.out.println(map);
        map.put(null,"李四");
    }
}
