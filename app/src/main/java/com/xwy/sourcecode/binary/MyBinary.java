package com.xwy.sourcecode.binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuweiyu on 2020/6/8.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class MyBinary {
    public String getBinary(int target) {
        return Integer.toBinaryString(target);
    }

    public int getOneCount(int target) {
        int count = 0;
        while (target != 0) {
            target = target & (target - 1);
            count++;
        }
        return count;
    }

    public boolean isPower(int target) {
        return (target & (target - 1)) == 0;
    }

    public int minPowerTarget(int target) {
        target = target - 1;//避免target直接是一个2的n次幂
        target |= (target >>> 1);
        target |= (target >>> 2);
        target |= (target >>> 4);
        target |= (target >>> 8);
        target |= (target >>> 16);
        return target - (target >>> 1);
    }


    private int maxI(int[] arr, int i) {
        int target = arr[i];
        for (int j = i; j < arr.length; j++) {
            if (arr[j] > target) {
                target = arr[j];
            }
        }
        return target - arr[i];
    }

    public int max(int[] arr) {
        int max = maxI(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            if (maxI(arr, i) > max) {
                max = maxI(arr, i);
            }
        }
        return max;
    }

    public int maxLength(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp += arr[i];
            } else {

            }
        }

        return 0;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int gap = target - nums[i];
            if (map.containsKey(gap) && map.get(gap) != i) {
                result[0] = i;
                result[1] = map.get(gap);
            }
        }
        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int result = 0;
        while (l1 != null || l2 != null) {
            result *= 10;
            int end1 = (l1 != null) ? l1.value : 0;
            int end2 = (l2 != null) ? l2.value : 0;
            result += (end1 + end2);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        ListNode listNode = new ListNode();
        while (result != 0) {
            ListNode listNode1 = new ListNode();
            listNode1.value = result & 1;
            result = result >>> 1;
            listNode.next = listNode1;
        }
        return listNode;
    }
}
