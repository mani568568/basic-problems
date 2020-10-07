package com.m.g.arrays;

import org.junit.Test;

public class IPrintPairsSumIsXUsingHashTest {

    IPrintPairsSumIsXUsingHash iPrintPairsSumIsXUsingHash = new IPrintPairsSumIsXUsingHash();

    @Test
    public void testPrintPairsSumIsXUsingHash()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int sum = 9;
        iPrintPairsSumIsXUsingHash.printPairsSumIsXUsingHash(arr,sum);
    }
}
