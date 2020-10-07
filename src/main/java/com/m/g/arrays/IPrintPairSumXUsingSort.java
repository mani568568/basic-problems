package com.m.g.arrays;

import java.util.Arrays;

public class IPrintPairSumXUsingSort {

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


}
