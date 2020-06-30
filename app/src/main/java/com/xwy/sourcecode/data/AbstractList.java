package com.xwy.sourcecode.data;

/**
 * Created by xuweiyu on 2020/6/29.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public abstract class AbstractList<E> implements List<E>{
    protected int size;

    private void outOfIndex(int index) {
        throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
    }

    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfIndex(index);
        }
    }

    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfIndex(index);
        }
    }
}
