package com.m.g.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeAverageLevelsTest {

    BinaryTreeAverageLevels binaryTreeAverageLevels = new BinaryTreeAverageLevels();

    @Test
    public void basicFlow()
    {
        TreeNode root = null;
        root = new TreeNode(3);
        root.setLeftNode(new TreeNode(2));
        root.setRightNode(new  TreeNode(9));
        root.getLeftNode().setLeftNode(new TreeNode(3));
        root.getLeftNode().setRightNode( new TreeNode(4) );
        root.getRightNode().setRightNode(new TreeNode(2)) ;
        List<Double> returnValues = binaryTreeAverageLevels.calculateAvgOfLevels(root);

        Assert.assertEquals(returnValues.get(0).doubleValue(),3.0,0.0);
        Assert.assertEquals(returnValues.get(1).doubleValue(),5.5,0.0);
        Assert.assertEquals(returnValues.get(2).doubleValue(),3.0,0.0);
    }
}
