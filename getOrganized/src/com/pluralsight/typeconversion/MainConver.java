package com.pluralsight.typeconversion;

public class MainConver {

    public static void main(String[] args) {

        float floatVal = 1.0f;
        double doubleVal = 2.5d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVar = 5;

        short result1 = (short)(doubleVal-floatVal);
        System.out.println("Success "+ result1);
    }
}
