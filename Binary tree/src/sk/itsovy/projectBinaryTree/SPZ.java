package sk.itsovy.projectBinaryTree;

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class SPZ {

    private File doc;

    public SPZ(File doc){
    this.doc=doc;
    }

    void printSPZ(){
        int index=0;
        Scanner scan = null;
        try {
            scan = new Scanner(doc);
            while (scan.hasNextLine()){
                String riadok=scan.nextLine();
             /*   if (riadok.toCharArray().length == 8){
                    System.out.println(scan.nextLine());
                }else{
                    System.out.println(index);
                    index++;
                }*/
//                if(riadok.matches("[A-Z]{2} [0-9]{3}[A-Z]{2}")){
//                    System.out.println(riadok);
//                }
                if (riadok.length()==8){
                    if ((riadok.charAt(0)>= 'A' && riadok.charAt(0) <= 'Z') && (riadok.charAt(1)>= 'A' && riadok.charAt(1) <= 'Z')){
                        if (riadok.charAt(2)==32){
                            if (((riadok.charAt(3)>= 48 && riadok.charAt(3) <= 57) && (riadok.charAt(4)>= 48 && riadok.charAt(4) <= 57))&&riadok.charAt(5)>= 48 && riadok.charAt(5) <= 57){
                                if ((riadok.charAt(6)>= 65 && riadok.charAt(6) <= 90) && (riadok.charAt(7)>= 65 && riadok.charAt(7) <= 90)){
                                    System.out.println('\n'+riadok);
                                }

                            }
                        }
                    }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
