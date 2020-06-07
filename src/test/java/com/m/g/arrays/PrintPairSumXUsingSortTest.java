package com.m.g.arrays;

import org.junit.Test;

public class PrintPairSumXUsingSortTest {

    PrintPairSumXUsingSort printPairSumXUsingSort = new PrintPairSumXUsingSort();

    @Test
    public void testPrintPairSumXUsingSort()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int sum = 9;
        printPairSumXUsingSort.printPairSumXUsingSort(arr,sum);
    }

}
