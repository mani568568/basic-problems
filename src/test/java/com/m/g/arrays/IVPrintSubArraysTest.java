package com.m.g.arrays;

import org.junit.Test;

public class IVPrintSubArraysTest {

    IVPrintSubArrays ivPrintSubArrays = new IVPrintSubArrays();

    @Test
    public void validateBasicInput()
    {
        ivPrintSubArrays.printSubArrays(new int[]{1,2,3});
    }
}
