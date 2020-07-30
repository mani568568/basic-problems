package com.m.g.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Problem:
 * =======
 * Given a binary tree, print the average value of the nodes on each level.
 *
 * Example:
 * =======
 *
 *     3
 *    / \
 *   2   9
 *  / \   \
 * 3   2   7
 *
 * Output : [3 , 5.5 , 5]
 * The average value of nodes on
 *
 * level 0 is 3,
 * level 1 is 5.5, and on
 * level 2 is 5.
 *
 * Hence, print [3 5.5 4].
 */
public class BinaryTreeAverageLevels {

    public List<Double> calculateAvgOfLevels(TreeNode treeNode)
    {
        // variable to hold the return values...
        List<Double> result = new ArrayList<>();

        // Base condition to validate the treeNode is null or not
        if(treeNode==null)
            return null;

        // DS used to traverse through the Tree in BFS...
        Queue<TreeNode> queue = new LinkedList<>();

        // adding the root element to the Queue...
        queue.add(treeNode);

        while (!queue.isEmpty())
        {
            // retrieving the current size of the queue...
            int currentSize = queue.size();

            // this variable holds the sum of nodes at every level
            double currentTotal = 0;

            // this is a loop which will iterate through all
            // the elements in the current queue...
            for(int index = 0; index < currentSize; index++)
            {
                // retrieves the current node...
                TreeNode currentNode = queue.poll();

                // retrieves the left node and adds it to the queue.
                if(currentNode.getLeftNode()!=null)
                {
                    queue.add(currentNode.getLeftNode());
                }
                // retrieve the right node and adds it to the queue.
                if(currentNode.getRightNode()!=null)
                {
                    queue.add(currentNode.getRightNode());
                }

                // sums up all the nodes at the level...
                currentTotal+=currentNode.getNode();

            }

            // calculate the average and save it to the result variable.
            result.add(currentTotal/currentSize);

        }

        return result;

    }
}
