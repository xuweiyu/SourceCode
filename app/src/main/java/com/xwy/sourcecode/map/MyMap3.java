package com.xwy.sourcecode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuweiyu on 2020/5/28.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class MyMap3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String value = map.put("1","2");
        String value1 = map.put("1","3");
        System.out.println("value = "+value);
        System.out.println("value1 = "+value1);
    }
}
