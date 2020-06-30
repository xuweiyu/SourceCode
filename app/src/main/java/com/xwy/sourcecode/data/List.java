package com.xwy.sourcecode.data;

/**
 * Created by xuweiyu on 2020/6/29.
 * email: xuweiyu@igengmei.com
 * 简介：线性表的公共接口
 */
public interface List<E> {
    void clear();

    int size();

    boolean isEmpty();

    boolean contains(E element);

    E remove(E element);

    E remove(int index);

    int indexOf(E element);

    void add(E element);

    void add(int index, E element);

    E get(int index);

    E set(int index, E element);
}
