package com.m.g.arrays;

public class IVPrintSubArrays {

    /**
     * Find all the possible sub arrays in a given array.
     */
     public void printSubArrays(int inputArray[])
     {
         for(int startIndex = 0;startIndex<inputArray.length;startIndex++)
         {
             for(int endIndex = startIndex;endIndex<inputArray.length;endIndex++ )
             {

                 for(int index = startIndex;index<=endIndex;index++)
                 {
                     System.out.print(inputArray[index] + " ");
                 }
                 System.out.println();
             }
         }
     }

}
