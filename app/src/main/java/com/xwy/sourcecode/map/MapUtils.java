package com.xwy.sourcecode.map;

import android.annotation.SuppressLint;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by xuweiyu on 2020/5/28.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class MapUtils {
    public static void getCapacity(HashMap map){
        try {
            @SuppressLint("SoonBlockedPrivateApi") Method method = HashMap.class.getDeclaredMethod("capacity");
            method.setAccessible(true);
            System.out.println("数组容量 = "+method.invoke(map));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
