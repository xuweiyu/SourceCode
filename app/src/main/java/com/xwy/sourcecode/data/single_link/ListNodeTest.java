package com.xwy.sourcecode.data.single_link;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xuweiyu on 2020/6/29.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ListNodeTest {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(1, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode listNode0 = new ListNode(0, listNode1);
        System.out.println(removeRepeatListNode(listNode0));
    }

    private static void remove(ListNode listNode) {
        if (listNode == null || listNode.next == null) listNode = null;
        listNode.value = listNode.next.value;
        listNode.next = listNode.next.next;
    }

    private static ListNode turnAround(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    private static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        //该方法是返回一个反转了的链表，先将next反转
        ListNode newListNode = reverse(head.next);
        //完成next的反转之后再让head的next的next指向head
        head.next.next = head;
        //让head的next指向空
        head.next = null;
        return newListNode;
    }

    private static boolean isAnnularNode(ListNode listNode) {
        if (listNode == null || listNode.next == null) return false;
        ListNode slow = listNode;
        ListNode fast = listNode.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    private static ListNode getMidNode(ListNode listNode) {
        if (listNode == null || listNode.next == null) return listNode;
        ListNode slow = listNode;
        ListNode fast = listNode;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode removeRepeatNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            //从当前节点开始往后遍历
            ListNode temp = current;
            while (temp.next != null) {
                //如果往后的某一个节点等于当前节点的值则往后移动越过这个节点
                if (temp.next.value == current.value) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    private static ListNode removeRepeatListNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head;
        Set<Integer> set = new HashSet<>();
        set.add(node.value);
        while (node.next != null) {
            if (!set.add(node.next.value)) {
                node.next = node.next.next;
            }
            node = node.next;
        }
        return head;
    }

    private static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
