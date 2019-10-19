package com.timbuchalka.ChallengeReadInput;

import java.util.Scanner;

public class ChallInput {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sum=0;
        int counter=0;
        for (int i=1;i<=10;i++){
            System.out.println("Type #"+i+".number: ");
            boolean isInt = input.hasNextInt();
            if(isInt) {
                counter = input.nextInt();
                sum +=counter;
            }else{
                System.out.println("Invalid number");
                i-=1;
            }

            input.nextLine(); //for removing the current value before nextscanner begin /read and remove from the scanner
        }
        System.out.println("Sum of numbers is:"+sum);
        input.close();
    }
}
