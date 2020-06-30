package com.xwy.sourcecode.data.circle;

import androidx.annotation.NonNull;

import com.xwy.sourcecode.data.AbstractList;

/**
 * Created by xuweiyu on 2020/6/30.
 * email: xuweiyu@igengmei.com
 * 简介：单向循环链表
 */
public class SingleCircleLinkedList<E> extends AbstractList<E> {
    public static final int ELEMENT_NOT_FOUND = -1;
    private Node<E> first;


    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    @Override
    public E remove(E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = first;
        if (index == 0) {
            if (size != 1) {//无法解决size等于1的情况
                //拿到最后一个节点,拿最后一个节点一定要在first = first.next之前，因为node方法会用到first
                Node last = node(size - 1);
                first = first.next;
                last.next = first;
            } else {
                first = null;
            }
        } else {
            Node<E> prev = node(index - 1);
            node = prev.next;
            prev.next = node.next;
        }
        size--;
        return node.element;
    }

    @Override
    public int indexOf(E element) {
        Node<E> node = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (node.element == null) return i;
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(node.element)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    @Override
    public void add(E element) {
        add(size, element);
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        if (index == 0) {
            Node newFirst = new Node<>(element, first);
            //第一次插入元素
            if (size == 0) {
                newFirst.next = first;
            } else {
                Node last = node(size - 1);
                last.next = newFirst;
            }
            first = newFirst;
        } else {
            Node<E> prev = node(index - 1);
            prev.next = new Node<>(element, prev.next);
        }
        size++;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size = ").append(size).append(",[");
        Node node = first;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(node.element);
            stringBuilder.append("->");
            if (i != size - 1) {
                node = node.next;
            } else {
                stringBuilder.append("]");
            }
        }
        return stringBuilder.toString();
    }

    private static class Node<E> {
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
