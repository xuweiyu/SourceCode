package com.xwy.sourcecode.tree;

import android.text.TextUtils;

import androidx.annotation.NonNull;

/**
 * Created by xuweiyu on 2020/6/3.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class TreeNode {
    public TreeNode leftChild;
    public TreeNode rightChild;
    public String value;
    public int intValue;

    public TreeNode(TreeNode leftChild, TreeNode rightChild, String value) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.value = value;
    }

    public TreeNode(TreeNode leftChild, TreeNode rightChild, int value) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.intValue = value;
    }

    @NonNull
    @Override
    public String toString() {
        return value == null ? String.valueOf(intValue) : value;
    }
}
