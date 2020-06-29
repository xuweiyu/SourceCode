package com.xwy.sourcecode.tree;

/**
 * Created by xuweiyu on 2020/6/4.
 * email: xuweiyu@igengmei.com
 * 简介：BST 二叉排序树
 */
public class Bst {
    public static void main(String[] args) {
        TreeNode treeNode = TreeUtils.getBinarySortTree();
        TreeNode1 treeNode1 = TreeUtils.getTree1();
//        System.out.println(findValue(47,treeNode));
//        System.out.println(findValue(0,treeNode));
//        System.out.intln(findValue(93, treeNode));
        insert(60, treeNode);
        insert(58, treeNode);
        print(treeNode);
    }

    private static void print(TreeNode treeNode){
        if (treeNode!=null){
            System.out.print(treeNode.intValue+"  ");
            print(treeNode.leftChild);
            print(treeNode.rightChild);
        }
    }

    private static TreeNode findValue(int value, TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        } else {
            if (value == treeNode.intValue) {
                return treeNode;
            } else if (value > treeNode.intValue) {
                return findValue(value, treeNode.rightChild);
            } else {
                return findValue(value, treeNode.leftChild);
            }
        }
    }

    private static TreeNode findValue(int value, TreeNode treeNode, TreeNode parent) {
        if (treeNode == null) {
            return parent;
        } else {
            if (value == treeNode.intValue) {
                return treeNode;
            } else if (value > treeNode.intValue) {
                return findValue(value, treeNode.rightChild, treeNode);
            } else {
                return findValue(value, treeNode.leftChild, treeNode);
            }
        }
    }

    private static void insert(int value, TreeNode treeNode) {
        if (treeNode == null) {
            treeNode = new TreeNode(null, null, value);
        } else {
            TreeNode find = findValue(value, treeNode, null);
            if (find.intValue == value) {//找到这个value了
                //根据需求做
            } else if (find.intValue > value) {
                find.leftChild = new TreeNode(null, null, value);
            } else {
                find.rightChild = new TreeNode(null, null, value);
            }
        }
    }
}
