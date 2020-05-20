package com.m.g.arrays;

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

}
