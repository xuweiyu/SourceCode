package com.xwy.sourcecode.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by xuweiyu on 2020/6/3.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class Preorder {
    public static void main(String[] args) {
//        TreeNode treeNode = TreeUtils.getTree();
//        prePrint(treeNode);
//        midPrint(treeNode);
//        endPrint(treeNode);
//        TreeNode1 treeNode1 = TreeUtils.getTree1();
//        layerPrint(treeNode1);

    }


    private static void prePrint(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode + "  ");
            prePrint(treeNode.leftChild);
            prePrint(treeNode.rightChild);
        }
    }

    private static void midPrint(TreeNode treeNode) {
        if (treeNode != null) {
            midPrint(treeNode.leftChild);
            System.out.print(treeNode + "  ");
            midPrint(treeNode.rightChild);
        }
    }

    private static void endPrint(TreeNode treeNode) {
        if (treeNode != null) {
            endPrint(treeNode.leftChild);
            endPrint(treeNode.rightChild);
            System.out.print(treeNode + "  ");
        }
    }

    private static void layerPrint(TreeNode1 treeNode) {
        getList(treeNode, null);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
    }

    private static List<TreeNode1> list = new ArrayList<>();

    private static void getList(TreeNode1 leftChild, TreeNode1 rightChild) {
        if (leftChild != null) {
            list.add(leftChild);
            getList(leftChild.leftChild, leftChild.rightChild);
        }
        if (rightChild != null) {
            list.add(rightChild);
            getList(rightChild.leftChild, rightChild.rightChild);
        }
    }
}
