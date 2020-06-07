package com.m.g.arrays;

import org.junit.Test;

public class CountDistinctPairsWithDifferenceXTest {

    CountDistinctPairsWithDifferenceX countDistinctPairsWithDifferenceX = new CountDistinctPairsWithDifferenceX();

    @Test
    public void testCountDistinctPairsWithDifferenceX()
    {
        int[] arr = {1,4,3,2,6,5,7};
        int difference = 2;
        int result =  countDistinctPairsWithDifferenceX.countDistinctPairsWithDifferenceX(arr,difference);
        System.out.println(result);
    }
}
