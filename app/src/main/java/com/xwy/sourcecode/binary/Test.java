package com.xwy.sourcecode.binary;

/**
 * Created by xuweiyu on 2020/6/8.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Test {
    public static void main(String[] args) {
      MyBinary binary = new MyBinary();
//      System.out.println(binary.isPower(-1));
//      System.out.println(binary.minPowerTarget(-1));
//      System.out.println(binary.minPowerTarget(11));
//        binary.addTwoNumbers(26);
//        ListNode listNode1 = new ListNode();
//        listNode1.value = 3;
//        ListNode listNode2 = new ListNode();
//        listNode2.value = 4;
//        listNode2.next = listNode1;
//        ListNode listNode3 = new ListNode();
//        listNode3.value = 2;
//        listNode3.next = listNode2;
//
//        ListNode listNode11 = new ListNode();
//        listNode11.value = 3;
//        ListNode listNode21 = new ListNode();
//        listNode21.value = 4;
//        listNode21.next = listNode11;
//        ListNode listNode31 = new ListNode();
//        listNode31.value = 2;
//        listNode31.next = listNode21;
//        System.out.println(binary.addTwoNumbers(listNode3,listNode31));
        Dp dp = new Dp();
        System.out.println(dp.getMaxLengthPalindromeStr("dadadadaqwerrewq"));
    }
}
