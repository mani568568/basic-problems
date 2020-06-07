package com.m.g.arrays;

import org.junit.Test;

public class PrintPairsSumIsXUsingHashTest {

    PrintPairsSumIsXUsingHash printPairsSumIsXUsingHash = new PrintPairsSumIsXUsingHash();

    @Test
    public void testPrintPairsSumIsXUsingHash()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int sum = 9;
        printPairsSumIsXUsingHash.printPairsSumIsXUsingHash(arr,sum);
    }
}
