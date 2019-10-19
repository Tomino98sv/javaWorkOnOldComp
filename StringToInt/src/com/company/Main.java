package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String WordToInt = "2018.125";
        System.out.println("String WordToInt: " + WordToInt);

        double intNumber = Double.parseDouble(WordToInt);
        System.out.println("number: " + intNumber);

        WordToInt += 1;
        intNumber += 1;

        System.out.println("String WordToInt: " + WordToInt);
        System.out.println("number: " + intNumber);

    }
}
