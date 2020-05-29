package com.m.g.ads;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomHashMapTest {

    @Test
    public void testCustomHashMapHappyFlow()
    {
        CustomHashMap<Integer,String> customHashMap = new CustomHashMap<>();
        customHashMap.put(25,"Mani");
        customHashMap.put(2,"Gui");
        assertEquals(customHashMap.get(25),"Mani");
        assertEquals(customHashMap.get(2),"Gui");
    }
}
