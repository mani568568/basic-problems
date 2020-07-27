package com.m.g.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Turn90DegreesLeftTest {

    Turn90DegreesLeft turn90DegreesLeft = new Turn90DegreesLeft();

    @Test
    public void testTurn90DegreesLeft()
    {
        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] result = turn90DegreesLeft.turn90DegreesLeft(input);

        assertEquals(result[0][0],4);

        // find the rows...
        int rows = input.length;

        // find the columns...
        int cols = input[0].length;


        for(int outerIndex = 0;outerIndex<rows;outerIndex++)
        {
            for(int innerIndex = 0;innerIndex<cols;innerIndex++)
            {
                System.out.print(result[outerIndex][innerIndex] + " " );
            }
            System.out.println();
        }


    }
}
