package com.xwy.sourcecode.tree;

/**
 * Created by xuweiyu on 2020/6/3.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class TreeUtils {
    /**
     * https://upload-images.jianshu.io/upload_images/7043118-df454c0a574836de.png?imageMogr2/auto-orient/strip|imageView2/2/w/441
     *
     * @return
     */
    public static TreeNode getTree() {
        TreeNode h = new TreeNode(null, null, "H");
        TreeNode i = new TreeNode(null, null, "I");
        TreeNode j = new TreeNode(null, null, "J");
        TreeNode d = new TreeNode(h, i, "D");
        TreeNode e = new TreeNode(j, null, "E");
        TreeNode f = new TreeNode(null, null, "F");
        TreeNode g = new TreeNode(null, null, "G");
        TreeNode b = new TreeNode(d, e, "B");
        TreeNode c = new TreeNode(f, g, "C");
        return new TreeNode(b, c, "A");
    }

    public static TreeNode1 getTree1() {
        TreeNode1 a = new TreeNode1(null, true, "A");
        TreeNode1 b = new TreeNode1(a, true, "B");
        TreeNode1 c = new TreeNode1(a, false, "C");
        TreeNode1 d = new TreeNode1(b, true, "D");
        TreeNode1 e = new TreeNode1(b, false, "E");
        TreeNode1 f = new TreeNode1(c, true, "F");
        TreeNode1 g = new TreeNode1(c, false, "G");
        TreeNode1 h = new TreeNode1(d, true, "H");
        TreeNode1 i = new TreeNode1(d, false, "I");
        TreeNode1 j = new TreeNode1(e, true, "J");
        return a;
    }

    public static TreeNode getBinarySortTree() {
        TreeNode a = new TreeNode(null, null, 37);
        TreeNode b = new TreeNode(null, a, 35);
        TreeNode c = new TreeNode(null, null, 51);
        TreeNode d = new TreeNode(b, c, 47);
        TreeNode e = new TreeNode(d, null, 59);
        TreeNode f = new TreeNode(null, null, 93);
        TreeNode g = new TreeNode(f, null, 98);
        TreeNode h = new TreeNode(null, null, 73);
        TreeNode i = new TreeNode(h, g, 87);
        return new TreeNode(e, i, 61);
    }
}
