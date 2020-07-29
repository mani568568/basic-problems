package com.m.g.java;

public class TypeCastingEx {

    public static void main(String[] args) {

        // case:1
        // ClassCastException --> Runtime Exception
        PTypeCast pTypeCast = new C1TypeCast();
        ((C1TypeCast)pTypeCast).cast();

        // case:2
        // the following code gives
        // Inconvertible types; cannot cast 'com.m.g.java.C1TypeCast' to 'com.m.g.java.C2TypeCast'
        C1TypeCast cTypeCast = new C1TypeCast();
        // ((C2TypeCast)cTypeCast).cast();

        // case:3
        // the following code gives
        // TypeCastingEx.java:22: error: incompatible types: C1TypeCast cannot be converted to C2TypeCast
        C1TypeCast c1TypeCast = new C1TypeCast();
        // C2TypeCast c2TypeCast = ((C1TypeCast)c1TypeCast);


    }
}


class PTypeCast
{
    public void cast(){System.out.println("Parent");}
}

class C1TypeCast extends PTypeCast
{
    public void cast(){System.out.println("Child1");}
}

class C2TypeCast extends PTypeCast
{
    public void cast(){System.out.println("Child2");}
}