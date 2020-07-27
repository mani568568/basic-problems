package com.m.g.arrays;

public class Turn90DegreesLeft {


    public int[][] turn90DegreesLeft(int[][] input)
    {

        // Base case: If the given input is null nothing to process...
        if(input==null || input[0]==null)
            return null;

        // reverse the columns...
        int[][] result =  reverseColumns(input);

        // perform the transpose i.e. reverse the rows and columns
        result = transpose(result);

        return result;
    }

    private int[][] transpose(int[][] result) {
        for(int index=0;index<result.length;index++) {
            for (int innerIndex = index; innerIndex < result[0].length; innerIndex++) {
                int tempVal = result[innerIndex][index];
                result[innerIndex][index] = result[index][innerIndex];
                result[index][innerIndex] = tempVal;
            }
        }
        return result;
    }

    private int[][] reverseColumns(int[][] input) {
        // find the rows...
        int rows = input.length;

        // find the columns...
        int cols = input[0].length;

        for (int index=0;index<rows;index++)
        {
            for(int startIndex =0,endIndex=cols-1;startIndex<endIndex;startIndex++,endIndex--)
            {
                int tempVal = input[index][startIndex];
                input[index][startIndex] = input[index][endIndex];
                input[index][endIndex] = tempVal;
            }
        }
        return input;
    }

}
