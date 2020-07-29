package com.m.g.java;

public class StaticFlowWhenClassLoaded {

    static int nameLessVal = 20;

    static
    {
        // Direct read:Reading a static variable from static block
        System.out.println("Accessing from Static block Initialized Variable nameLessVal ::"+nameLessVal);
        accessStatic();
    }

    public static void accessStatic()
    {
        // In Direct read:Reading a static variable from static method
        System.out.println("Accessing from Static method Initialized Variable nameLessVal ::"+nameLessVal);
    }

    static
    {
        // Note : Direct read is not supported for uninitialized variable.
        // If we try to access the uninitialized value from static block
        // we get the following compilation error:
        // Illegal forward reference
        //System.out.println(unInitializedVal);
        accessIndirectRead();
    }

    public static void accessIndirectRead()
    {
        // Note : InDirect read is supported for uninitialized variable.
        // So no error...
        System.out.println("Accessing from Static method unInitializedVal ::"+unInitializedVal);
    }

    static int unInitializedVal = 1000;

    public static void main(String[] args) {
        System.out.println("Main Method completed");
    }
}
