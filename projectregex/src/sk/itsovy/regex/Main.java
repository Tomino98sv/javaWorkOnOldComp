package sk.itsovy.regex;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
	// write your code here
//        Regex regex = new Regex();
//        System.out.println(regex.checkMail("tomas@jozo.com"));
//        System.out.println(regex.checkMail("tomas.ad@"));
//
//        String numb = input.nextLine();
//        System.out.println("Your number is \n"+numb+"\n"+regex.checkPhoneNumber(numb));

        App apka = new App();
        System.out.println(apka.reverse("maratona"));

        System.out.println(apka.formatName("jAno zAvacky"));

        double firstPrice=0;
        double secondPrice=0;
        boolean first=false;
        boolean second=false;


        boolean firsttime = true;
        while(true){
            if (first==false){
                try {
                    System.out.println("Type first number");
                    input = new Scanner(System.in);
                    firstPrice=input.nextDouble();
                    first=validationNumber(firstPrice);
                }catch (Exception e){
                    System.out.println("wrong input for a First number");
                }
            }

            if (second==false){
                try {
                    System.out.println("Type second number");
                    input = new Scanner(System.in);
                    secondPrice=input.nextDouble();
                    second=validationNumber(secondPrice);
                }catch (Exception e){
                    System.out.println("wrong input for a Second number");
                }
            }


            if (first&&second){
                System.out.println("first number "+firstPrice);
                System.out.println("second number "+secondPrice);
                System.out.println("Result is "+(firstPrice-secondPrice));
                break;
            }
        }

    }

    public static boolean validationNumber(double number){
        String numberS = Double.toString(number);
        Pattern vzor = Pattern.compile("^[0-9]{1,6}(\\.[0-9]{1,2})?$");
        Matcher m = vzor.matcher(numberS);

        return m.matches();
    }

}


class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}


