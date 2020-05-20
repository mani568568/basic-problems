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
