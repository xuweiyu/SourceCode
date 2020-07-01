package com.xwy.sourcecode.data.stack;

import java.util.Stack;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Browse<E> {
    private Stack<E> stack = new Stack<>();
    private Stack<E> stackPop = new Stack<>();

    public E open(E element) {
        stack.push(element);
        while (!stackPop.isEmpty()) {
            stackPop.pop();
        }
        System.out.println("新打开" + element);
        return element;
    }

    public void back() {
        if (stack.size() > 1) {
            E element = stack.pop();
            stackPop.push(element);
            System.out.println("向后展示" + stack.get(stack.size() - 1));
        } else {
            System.out.println("无法后退");
        }
    }

    public void forward() {
        if (!stackPop.isEmpty()) {
            E element = stackPop.pop();
            stack.push(element);
            System.out.println("向前展示" + element);
        } else {
            System.out.println("无法前进");
        }
    }
}
