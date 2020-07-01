package com.xwy.sourcecode.data.circle;

import androidx.annotation.NonNull;

import com.xwy.sourcecode.data.AbstractList;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class CircleLinkedList<E> extends AbstractList<E> {
    public static final int ELEMENT_NOT_FOUND = -1;
    private Node<E> first;
    private Node<E> last;
    private Node<E> current;

    @Override
    public void clear() {
        first = null;
        last = null;
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

    public void reset() {
        current = first;
    }

    public E next() {
        if (current == null) {
            return null;
        } else {
            current = current.next;
            //双向循环链表这里不会为空
            return current.element;
        }
    }

    public E remove() {
        if (current == null) {
            return null;
        } else {
            Node next = current.next;
            E element = remove(current);
            //删完链表空了，也就是之前只剩一个元素
            if (size == 0) {
                current = null;
            } else {
                current = next;
            }
            System.out.println(element);
            return element;
        }
    }

    public E remove(Node<E> node) {
        if (size == 1) {
            first = null;
            last = null;
        } else {
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
            if (node == first) {
                first = next;
            }
            if (node == last) {
                last = prev;
            }
        }
        size--;
        return node.element;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        return remove(node(index));
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
        //处理插在末尾的情况
        if (index == size) {
            Node oldLast = last;
            last = new Node<>(element, first, oldLast);
            if (oldLast == null) {//处理插入第1个元素的情况
                first = last;
                first.next = first;
                first.prev = first;
            } else {
                oldLast.setNext(last);
                first.prev = last;
            }
        } else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> newNode = new Node<>(element, next, prev);
            next.setPrev(newNode);
            //这种情况下prev肯定不为空
            prev.setNext(newNode);
            if (index == 0) {//插入头结点
                first = newNode;
            }
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
        if (index < (size >> 1)) {//向后查找
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {//向前查找
            Node<E> node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size = ").append(size).append(",[");
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append("<->");
            }
            stringBuilder.append(node.element);
            if (i == size - 1) {
                stringBuilder.append("]");
            }
            node = node.next;
        }
        return stringBuilder.toString();
    }

    public static class Node<E> {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
