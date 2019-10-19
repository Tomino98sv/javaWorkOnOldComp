package com.timbuchalka.ParseInt;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("Now we have "+numberAsString+"year");

        int number = Integer.parseInt(numberAsString);
        number+=2;
        System.out.println(number);

    }
}
