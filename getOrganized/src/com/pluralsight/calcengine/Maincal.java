package com.pluralsight.calcengine;


import java.util.Scanner;

public class Maincal {

    public static void main(String[] args){

     public static CalEquation create(double leftVal, double rightVal, char operation){
        CalEquation equation = new CalEquation();
        equation.val1=leftVal;
        equation.val2=rightVal;
        equation.opCode=operation;
        }

     double val1;
     double val2;
     char opCode;

    Scanner input = new Scanner(System.in);
        System.out.print("Enter double: ");
        val1 = input.nextDouble();

        System.out.print("Enter double: ");
        val2 = input.nextDouble();

        System.out.print("Type opCode for operation \n Addition= 'a' Subtraction='s' Multiplication='m' Division='d'");
        opCode = input.next().charAt(0);


    double result = create(val1,val2,opCode);
    }

}
