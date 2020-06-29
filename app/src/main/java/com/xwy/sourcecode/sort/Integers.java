package com.xwy.sourcecode.sort;

/**
 * Created by xuweiyu on 2020/6/9.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Integers {
    public static int[] getRandomList(int count, int min, int max) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (min + (Math.random() * (max - min)));
        }
        return arr;
    }

    public static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("_" + arr[i]);
        }
    }

    public static boolean isArc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
