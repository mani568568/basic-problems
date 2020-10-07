package com.m.g.arrays;

import org.junit.Test;

public class IPrintPairSumXUsingSortTest {

    IPrintPairSumXUsingSort iPrintPairSumXUsingSort = new IPrintPairSumXUsingSort();

    @Test
    public void testPrintPairSumXUsingSort()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int sum = 9;
        iPrintPairSumXUsingSort.printPairSumXUsingSort(arr,sum);
    }

}
