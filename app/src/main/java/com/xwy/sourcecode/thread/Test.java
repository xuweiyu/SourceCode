package com.xwy.sourcecode.thread;

/**
 * Created by xuweiyu on 2020/5/19.
 * email: xuweiyu@igengmei.com
 * 简介：链表反转
 */
public class Test {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node = revert(node);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    private static Node revert(Node node) {
        Node header = node.next;
        Node temp = null;
        while (header != null) {
            //保存现场
            node.next = temp;
            temp = node;
            node = header;
            //断链
            header = header.next;
        }
        node.next = temp;
        return node;
    }
}

class Node {
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }
}
