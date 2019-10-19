package com.timbuchalka.ChallengeMinAndMax;

import java.util.Scanner;

public class ChallMxMn {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer max = null;
        Integer min = null;
        //int min =0;
        //int max =0;
        int count=0;
        System.out.println("Enter number: ");
        while (true){
            count++;
            System.out.println("#"+count+"number:");
            boolean hasInt = input.hasNextInt();
            if(hasInt) {
                int number = input.nextInt();

           //     if (count == 1){
           //         max=number;
            //        min=number;
            //    }

                if (max == null && min == null){
                    max = number;
                    min = number;
                }

                if (max < number) {
                    max = number;
                }

                if (min > number) {
                    min = number;
                }
            }else {
                System.out.println("Invalid number");
                break;
            }
            input.nextLine();
        }
        System.out.println("Max number is: "+max +"\nMin number is: "+min);

        input.close();

    }
}
