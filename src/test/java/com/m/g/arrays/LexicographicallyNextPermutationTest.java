package com.m.g.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LexicographicallyNextPermutationTest {

    LexicographicallyNextPermutation lexicographicallyNextPermutation = new LexicographicallyNextPermutation();

    @Test
    public void testCountDistinctPairsWithDifferenceX()
    {
        int[] arr = {4,2,5,1,0};
        int difference = 2;
        int result[] =  lexicographicallyNextPermutation.findLexicographicallyNextPermutation(arr);
        assertEquals(Arrays.toString(result),"[4, 5, 0, 1, 2]");
    }
}
