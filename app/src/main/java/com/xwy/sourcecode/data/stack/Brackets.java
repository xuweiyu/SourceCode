package com.xwy.sourcecode.data.stack;

import android.text.TextUtils;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Brackets {
    public static boolean isEffective(String info) {
        if (info == null || "".equals(info)) return false;
        while (info.contains("()") || info.contains("[]") || info.contains("{}")) {
            info = info.replace("()", "");
            info = info.replace("[]", "");
            info = info.replace("{}", "");
        }
        return "".equals(info);
    }

    //只是为了记录括号，方便管理和判断
    private static HashMap<Character, Character> brackets = new HashMap<>();
    static {//在静态代码块中完成规则数据的初始化
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');
    }

    public static boolean isEffect(String info) {
        if (info == null || "".equals(info)) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < info.length(); i++) {
            char ch = info.charAt(i);
            if (brackets.containsKey(ch)) {
                stack.push(ch);
            } else {
                char pop = stack.pop();
                if (brackets.get(pop) != ch) return false;
            }
        }
        return stack.isEmpty();
    }
}
