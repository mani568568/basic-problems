package com.m.g.arrays;

import java.util.Arrays;

/**
 * Lexicographically next permutation
 * =================================
 * We need to find the two numbers so that swapping these numbers will produce
 * the permutation which is the smallest but larger than the given permutation.
 *
 * Let’s say these two elements are first_number and second_number.
 *
 * Iterate the given array from right to left and find the first index where the
 * left element is smaller than the right element.
 *
 * Once found, the element at the left index will be our first_number.
 * If no such index was found means the given array is the largest permutation possible,
 * in that case return the given array.
 *
 *  Now find the minimum element (which is greater than first_number)
 *  from the right element(found in the previous step) to the end of the array.
 *  This minimum element will be our second_number.
 *
 * Swap  first_number and second_number and sort the rest of the array
 * (from next index to end of the array) and this will be our answer for permutation
 * which is the smallest but greater than the given permutation.
 */

public class LexicographicallyNextPermutation {

    public int[] findLexicographicallyNextPermutation(int[] inputArray)
    {
        int arrayLen = inputArray.length-1;
        int firstIndex = -1;

        //find last index (first from iterating right to left) where left element is smaller than right element
        for(int index = arrayLen;index>0;index--)
        {
            if(inputArray[index]>inputArray[index-1])
            {
                firstIndex = index-1;
            }
        }

        //the given array is already largest permutation
        if(firstIndex==-1) {
            System.out.println("Original Array is already largest possible permutation: " + Arrays.toString(inputArray));
            return inputArray;
        }

        //find the smallest no on the right which is greater than inputArray[index]
        int secondIndex = firstIndex+1;
        for(int currentIndex = firstIndex+1;currentIndex<arrayLen;currentIndex++)
        {
            if(inputArray[currentIndex]<inputArray[currentIndex+1] && inputArray[currentIndex+1]<inputArray[firstIndex])
            {
                secondIndex = currentIndex+1;
            }
        }

        //swap elements
        int first = inputArray[firstIndex];
        int second = inputArray[secondIndex];
        inputArray[firstIndex] = second;
        inputArray[secondIndex] = first;

        //sort the rest of array in ascending order
        Arrays.sort(inputArray,firstIndex+1, arrayLen);
        System.out.println("smallest permutation greater than given array: " + Arrays.toString(inputArray));

        return inputArray;
    }

}
