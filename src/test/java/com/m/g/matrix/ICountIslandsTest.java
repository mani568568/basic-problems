package com.m.g.matrix;

import org.junit.Assert;
import org.junit.Test;

public class ICountIslandsTest {

    ICountIslands countIslands = new ICountIslands();

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
