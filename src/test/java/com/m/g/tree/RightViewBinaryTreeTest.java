package com.m.g.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RightViewBinaryTreeTest {

    RightViewBinaryTree rightViewBinaryTree = new RightViewBinaryTree();

    @Test
    public void basicFlow() {
        TreeNode root = null;
        root = new TreeNode(1);
        root.setLeftNode(new TreeNode(2));
        root.setRightNode(new TreeNode(3));
        root.getLeftNode().setRightNode(new TreeNode(5));
        root.getRightNode().setRightNode(new TreeNode(6));
        rightViewBinaryTree.getRightView(root);
    }

}
