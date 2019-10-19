package com.pluralsight.arrays;

import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double [] theVals = new double[10];

        for (int count=0;count<theVals.length;count++){
            theVals[count]= input.nextDouble();
        }

        for(double currentVal: theVals){
            System.out.println(currentVal);
        }

    }
}
