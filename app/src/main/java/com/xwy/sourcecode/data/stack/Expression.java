package com.xwy.sourcecode.data.stack;

import java.util.Stack;

/**
 * Created by xuweiyu on 2020/7/2.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Expression {
    //转为中缀表达式
    public static String getExpression(String[] data) {
        if (data == null || data.length < 1) return null;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < data.length; i++) {
            if (isMark(data[i])) {
                String top1 = stack.pop();
                String top2 = stack.pop();
                String temp = "(" + top2 + data[i] + top1 + ")";
                stack.push(temp);
            } else {
                stack.push(data[i]);
            }
        }
        return stack.pop();
    }

    public static int getExp(String[] tokens) {
        if (tokens == null || tokens.length < 1) return -1;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isMark(tokens[i])) {
                int top1 = Integer.parseInt(stack.pop());
                int top2 = Integer.parseInt(stack.pop());
                int temp = 0;
                if ("+".equals(tokens[i])) {
                    temp = top2 + top1;
                } else if ("-".equals(tokens[i])) {
                    temp = top2 - top1;
                } else if ("*".equals(tokens[i])) {
                    temp = top2 * top1;
                } else if ("/".equals(tokens[i])) {
                    temp = top2 / top1;
                }
                stack.push(String.valueOf(temp));
            } else {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    //判断是否为运算符
    private static boolean isMark(String info) {
        return "+".equals(info) ||
                "-".equals(info) ||
                "*".equals(info) ||
                "/".equals(info);
    }

    private static Stack<String> stringStack = new Stack<>();

    private static int calculate(String s) {
        if (s == null || "".equals(s)) return 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*' || ch == '/') {
                int top = Integer.parseInt(stringStack.pop());
                if (ch == '*') {
                    stringStack.push(String.valueOf(top * num));
                } else {
                    stringStack.push(String.valueOf(top / num));
                }
            } else if (ch == '+' || ch == '-') {

            } else {//数字
                //0的ascii码是48
                num = num * 10 + (ch - 48);
            }
        }
        return Integer.parseInt(stringStack.pop());
    }
}
