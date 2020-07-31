package com.m.g.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RightViewBinaryTree  {


    /**
     * This function prints the right view of a tree...
     * @param treeNode
     * @return
     */
    public List<Integer> getRightView(TreeNode treeNode )
    {
        // Evaluating the tree Node base condition...
        if(treeNode==null)
            return null;

        // this map maintains the levels as the key and node associated to level
        Map<Integer,Integer> map = new HashMap<>();

        // this function populates the map...
        computeRightView(treeNode,map,0);

        // return the values in the map which are the right most nodes...
        return new ArrayList<>(map.values());
    }

    // function populates the map whenever it encounters the new level...
    private void computeRightView(TreeNode treeNode, Map<Integer, Integer> map,int level) {

        // if the given tree node is null return it...
        if(treeNode==null)
            return;

        // if the map doesnt contains the key,
        if(!map.containsKey(level))
        {
            // then update the key and values as level and the node value.
            map.put(level,treeNode.getNode());
        }


        // scan through the left nodes.
        if(treeNode.getLeftNode()!=null)
        {
            // wen looking at the left node increment the level
            computeRightView(treeNode.getLeftNode(),map,level+1);
        }

        // scan through the right nodes.
        if(treeNode.getRightNode()!=null)
        {
            // wen looking at the right node increment the level
            computeRightView(treeNode.getRightNode(),map,level+1);
        }


    }

}
