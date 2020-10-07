package com.m.g.arrays;

public class IIICountDistinctPairsWithDifferenceX {

    public int countDistinctPairsWithDifferenceX(int arr[],int difference)
    {

        /**
         * Example:
         * Input: arr[] = {1, 5, 3, 4, 2}, k = 3
         * Output: 2
         * There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}
         *
         * Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
         * Output: 5
         * There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8},
         * {8, 12}, {12, 16} and {16, 20}
         *
         *
         */
        int count = 0;
        int hash[] = new int[100];

        for(int index = 0;index<arr.length;index++) {
            hash[arr[index]]=1;
        }

        for(int index = 0;index<arr.length;index++)
        {
            int currentData = arr[index];
            int nextElement = currentData+difference;
            if(nextElement>=0 && hash[nextElement]==1)
            {
                count++;
            }
        }
        return count;
    }
}
