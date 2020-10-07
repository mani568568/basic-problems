package com.m.g.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestThirdNumberTest {

    LargestThirdNumber largestThirdNumber = new LargestThirdNumber();

    @Test
    public void testCountDistinctPairsWithDifferenceX()
    {
        int[] arr = {4,2,5,1,0};
        int difference = 2;
        int result=  largestThirdNumber.findThirdLargestNumber(arr);
        assertEquals(result,2);
    }
}
