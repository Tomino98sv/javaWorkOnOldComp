package com.timbuchalka.Scanner;

import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of bitch:");

        boolean hasNextInt = input.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = input.nextInt();
            input.nextLine();

            System.out.println("Enter your name: ");

                String name = input.nextLine();
            int age = 2018 - yearOfBirth;

            if (age>0 && age<=100){
                System.out.println("Your name is:"+name+"\n Your age is:"+age);
            }else{
                System.out.println("Invalid year of birth");
            }

        }else{
            System.out.println("Unable to parse year of birth.");
        }

        input.close();
    }

}
