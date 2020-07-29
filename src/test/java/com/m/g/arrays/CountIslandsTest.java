package com.m.g.arrays;

import org.junit.Assert;
import org.junit.Test;

public class CountIslandsTest {

    CountIslands countIslands = new CountIslands();

    @Test
    public void validateBasicInput()
    {
        int[][] islands= new int[][] {  { 1, 1, 0, 0, 0 },
                                        { 0, 1, 0, 0, 1 },
                                        { 1, 0, 0, 1, 1 },
                                        { 0, 0, 0, 0, 0 },
                                        { 1, 0, 1, 0, 1 } };
        int noOfIslands = countIslands.countIslands(islands);
        Assert.assertEquals(noOfIslands,6);

    }

}
