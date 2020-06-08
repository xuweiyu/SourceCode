package com.xwy.sourcecode.tree;

import androidx.annotation.NonNull;

/**
 * Created by xuweiyu on 2020/6/3.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class TreeNode1 implements Comparable<TreeNode1> {
    public TreeNode1 leftChild;
    public TreeNode1 rightChild;
    public TreeNode1 parent;
    public int deep;
    public String value;
    public boolean isLeft;

    public TreeNode1(TreeNode1 parent, boolean isLeft, String value) {
        this.parent = parent;
        this.deep = parent == null ? 1 : parent.deep + 1;
        this.value = value;
        this.isLeft = isLeft;
        if (parent != null) {
            if (isLeft) {
                parent.leftChild = this;
            } else {
                parent.rightChild = this;
            }
        }
    }

    @Override
    public int compareTo(TreeNode1 o) {
        if (o == null) {
            return -1;
        }
        int diff = deep - o.deep;
        if (diff != 0) {
            return diff;
        } else if (parent == o.parent) {
            return this.isLeft ? -1 : 1;
        } else {
            return parent.compareTo(o.parent);
        }
    }

    @NonNull
    @Override
    public String toString() {
        return value;
    }
}
