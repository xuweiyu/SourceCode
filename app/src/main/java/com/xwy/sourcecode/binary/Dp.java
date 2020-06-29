package com.xwy.sourcecode.binary;

import android.text.TextUtils;

/**
 * Created by xuweiyu on 2020/6/9.
 * email: xuweiyu@igengmei.com
 * 简介：动态规划
 */
public class Dp {
    /**
     * 获取最大长度的回文字符串
     * 如 abccbaafe  最大回文字符串就是abccba
     * aba也是回文字符串
     *
     * @param str
     * @return
     */
    public String getMaxLengthPalindromeStr(String str) {
        if (str == null || "".equals(str)) {
            return str;
        }
        int[] index = new int[2];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp(str.substring(j, i))) {
                    if (i - j >= index[1] - index[0]) {
                        index[0] = j;
                        index[1] = i;
                    }
                }
            }
        }
        return str.substring(index[0], index[1]);
    }

    private boolean dp(String str) {
        if (str == null || "".equals(str)) {
            return false;
        } else if (str.length() == 1) {
            return true;
        } else if (str.length() == 2) {
            return str.charAt(0) == str.charAt(1);
        } else {
            return dp(str.substring(1, str.length() - 1));
        }
    }
}
