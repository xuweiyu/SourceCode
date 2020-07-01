package com.xwy.sourcecode.data.stack;

/**
 * Created by xuweiyu on 2020/7/1.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class BrowseTest {
    public static void main(String[] args) {
        Browse<String> browse = new Browse<>();
        browse.open("百度");
        browse.open("qq");
        browse.open("京东");
        browse.back();
        browse.back();
        browse.back();
        browse.forward();
        browse.back();
        browse.open("淘宝");
    }
}
