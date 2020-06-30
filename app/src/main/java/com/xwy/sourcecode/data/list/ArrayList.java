package com.xwy.sourcecode.data.list;

import androidx.annotation.NonNull;

/**
 * Created by xuweiyu on 2020/6/16.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class ArrayList<E> {
    private int size;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FOUND = -1;

    public ArrayList(int capacity) {
        capacity = Math.max(capacity, DEFAULT_CAPACITY);
        elements = (E[]) new Object[capacity];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 清空
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        if (elements != null && elements.length > DEFAULT_CAPACITY) {
            //缩容
            elements = (E[]) new Object[DEFAULT_CAPACITY];
        }
    }

    public int size() {
        return size;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 是否包含
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return indexOf(element) == ELEMENT_NOT_FOUND;
    }

    /**
     * 获取index处的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    /**
     * 给索引处设置元素
     *
     * @param index
     * @param element
     * @return
     */
    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    /**
     * 添加
     *
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    /**
     * 保证有capacity的容量
     *
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (capacity > oldCapacity) {//当需要的容量大于老的容量的时候需要扩容
            //扩容的系数是1.5
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            E[] newElements = (E[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
//            System.out.println(oldCapacity + ":" + newCapacity);
        }
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfIndex(index);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfIndex(index);
        }
    }

    private void outOfIndex(int index) {
        throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
    }

    public void add(E element) {
        add(size, element);
    }

    /**
     * 删除
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        rangeCheck(index);
        E old = elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
        trim();
        return old;
    }

    //缩容
    private void trim() {
        int capacity = elements.length;
        //容量大于最低容量，而且容量有一半浪费，而且容量除以2后还大于最低容量的时候扩容
        if (capacity > DEFAULT_CAPACITY && (capacity >> 1) > size && (capacity >> 1) >= DEFAULT_CAPACITY) {
            int newCapacity = capacity >> 1;
            E[] newElements = (E[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public boolean remove(E element) {
        if (indexOf(element) >= 0) {
            remove(indexOf(element));
            return true;
        }
        return false;
    }

    /**
     * 查看元素索引
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size = " + size).append(", [");
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(elements[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
