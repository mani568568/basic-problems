package com.m.g.arrays;

import java.util.Arrays;

public class ArrayProblems {

    public void printPairsSumIsXUsingHash(int arr[],int sum)
    {
        int len = arr.length;
        int[] hash = new int[100];
        for(int index = 0;index<len;index++)
        {
            int temp = sum-arr[index];
            if(temp>=0 && hash[temp]==1)
            {
                System.out.println("Pairs found :("+arr[index]+","+temp+")");
            }
            hash[arr[index]]=1;
        }
    }

    public void printPairSumXUsingSort(int arr[],int sum)
    {
       /**
        * Approach:
        * ========
        *  A tricky approach to solve this problem can be to use the two-pointer technique.
        *  But for using two pointer technique, the array must be sorted.
        *  Once the array is sorted the two pointers can be taken which mark the beginning and end of the array respectively.
        *  If the sum is greater than the sum of those two elements,
        *    shift the left pointer to increase the value of required sum and if the sum is lesser than the required value,
        *    shift the right pointer to decrease the value.
        *
        * Complexity Analysis:
        * ===================
        * Time Complexity: Depends on what sorting algorithm we use.
        *    If Merge Sort or Heap Sort is used then (-)(nlogn) in worst case.
        *    If Quick Sort is used then O(n^2) in worst case.
        *
        * Auxiliary Space: This too depends on sorting algorithm.
        *   The auxiliary space is O(n) for merge sort and O(1) for Heap Sort.
        *
        */

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right)
        {
            if(arr[left] + arr[right] == sum)
            {
                System.out.println("Pairs found :("+arr[left]+","+ arr[right]+")");
                return ;
            }
            else if (arr[left] + arr[right] < sum)
                left++;
            else
                right--;
        }
    }


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
