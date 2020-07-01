package com.xwy.sourcecode.data.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Stack<E>  {
    private List<E> list = new ArrayList<>();
    public E pop() {
        return list.remove(list.size() - 1);
    }

    public void push(E element) {
        list.add(element);
    }

    public E top() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
