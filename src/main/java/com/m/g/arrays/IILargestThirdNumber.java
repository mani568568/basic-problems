package com.m.g.arrays;

/**
 * Third largest element in an array of distinct elements
 *
 * Given an array of n integers, find the third largest element.
 * All the elements in the array are distinct integers.
 * Example :
 *
 * Input: arr[] = {1, 13, 2, 16, 10, 20}
 * Output: The third Largest element is 13
 */
public class IILargestThirdNumber {

    public int findThirdLargestNumber(int[] inputArray)
    {
        int firstNumber = Integer.MIN_VALUE;

        int secondNumber = Integer.MIN_VALUE;

        int thirdNumber = Integer.MIN_VALUE;

        for(int index = 0; index<inputArray.length;index++)
        {
            int currentNumber = inputArray[index];
            if(currentNumber>firstNumber)
            {
                thirdNumber = secondNumber;
                secondNumber = firstNumber;
                firstNumber = currentNumber;
            }
            else if(currentNumber>secondNumber)
            {
                thirdNumber = secondNumber;
                secondNumber = currentNumber;
            }
            else if(currentNumber>thirdNumber)
            {
                thirdNumber = secondNumber;
            }
        }

        return thirdNumber;
    }
}
