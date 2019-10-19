package sk.itsovy.projectexeption;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Example chyba = new Example();
//        chyba.arrayTestException();
        vargockova(20,2,5,8,4,98,3,35,12,3,12);
        String[] slovo= new String[2];
        slovo[0]="ahojte vandraci";
        System.out.println("slovo je "+slovo[0]);
        referencevariable(slovo);
        System.out.println("slovo nove je "+slovo[0]);

        Example chyba = new Example();
        chyba.arrayTestException();

        Scanner input = new Scanner(System.in);

        System.out.println("\nInput mail: ");
        String mail = input.nextLine();
        if(validateMail(mail)){
            System.out.println("Your email is "+mail+" GOOOOOOD MAIL");
        }else{
            System.out.println("Your email is "+mail+" BAAAAAAD MAIL");
        }

    }

    static boolean validateMail(String mail){
        //* prijima lubovolny pocet
        //. hocijaky znak
        //.find() len hlada ci sa tam nachadza
        //.matches() hlada presne ci je to to cele take
        Pattern pat = Pattern.compile("^([a-zA-Z0-9]?\\.?\\-?\\_?){1,}\\@{1}[a-zA-Z]{1,}\\.{1}[A-Za-z]{2,4}$");
        Matcher m = pat.matcher(mail);
        return  m.matches();


    }

    static void vargockova(int ...a){

        for(int i=0;i<a.length;i++)
        System.out.println(i+". hodnota "+a[i]);

    }

    static void referencevariable(String[] word){
        word[0] += " a curaci";
    }
}
