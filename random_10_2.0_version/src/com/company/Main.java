package com.company;

public class Main {

    public static void main(String[] args) {

        NumbersGenerator numbersGenerator = new NumbersGenerator();
       int[] array = numbersGenerator.generatingByReplacement(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        numbersGenerator.printArray(
                numbersGenerator.exchangeNumbersByRules(
                        numbersGenerator.generatingByCreatingNumbs(10)
                        ));

//        numbersGenerator.printArray(numbersGenerator.generatingByReplacement(25,1,2,3,4,5,6,7,8,9,10));
    }
}
