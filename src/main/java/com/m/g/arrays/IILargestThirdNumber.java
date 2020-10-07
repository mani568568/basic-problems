package com.m.g.arrays;

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
