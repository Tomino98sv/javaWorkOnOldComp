package sk.itsovy.regex;

import java.util.Arrays;

public class App {
    public double calInstallment(double sum, double interest, int month){
        //urok
        //return (sum*(1+interest/100.0)*month/12.0)/month;
        return (sum+((sum/100)*interest)*month)/month;
    }

    public double calHypotenuse(double a,double b){

        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public String reverse(String text){
        //obratene  slovo
        int lenght = text.length();
        String reverseW="";
        for (int a=lenght;a!=0;a--){
            reverseW+=text.charAt(a-1);
        }

        return reverseW;
    }

    public String formatName(String name){
        name=name.replaceAll("( )+"," ");
        name=name.toLowerCase();
        char[] slovo = name.toCharArray();

        slovo[0]-=32;
        for (int a=1;a<name.length();a++){
            if (name.charAt(a-1)==' '){
                slovo[a]-=32;
            }
        }

        name = new String(slovo);
        return name;
    }
}
