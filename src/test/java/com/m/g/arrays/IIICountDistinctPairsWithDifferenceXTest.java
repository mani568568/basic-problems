package com.m.g.arrays;

import org.junit.Test;

public class IIICountDistinctPairsWithDifferenceXTest {

    IIICountDistinctPairsWithDifferenceX countDistinctPairsWithDifferenceX = new IIICountDistinctPairsWithDifferenceX();

    @Test
    public void testCountDistinctPairsWithDifferenceX()
    {
        int[] arr = {1,4,2,3,5,7};
        int difference = 2;
        int result =  countDistinctPairsWithDifferenceX.countDistinctPairsWithDifferenceX(arr,difference);
        System.out.println(result);
    }
}
