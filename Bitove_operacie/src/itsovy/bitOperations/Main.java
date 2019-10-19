package itsovy.bitOperations;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[]att={1208,25,3814,4022,2991};

        System.out.println("zadaj parkovacie miesto");
        int place = input.nextInt();
        System.out.println("zadaj ktory den");
        int den = input.nextInt();
        if ((place<=12 && place>0)&&(den<=5 && den>0)) {
            System.out.println("vybral si miesto  " + place);
            System.out.println("vybral si den "+ den);
            double result = Math.pow(2,(double)place-1);
            for (int i=0;i<att.length;i++){
                int vys = att[i]&(int)result;
                if(vys==result){
                    System.out.println("miesto "+place+" v "+i+"den je volne");
                }else{
                    System.out.println("miesto "+place+" v "+i+"den je NENI volne");
                }
            }

            int zmena = att[den-1]|(int)result;
            System.out.println(zmena);
            System.out.println("\n\n");
            int comp = (int)Math.pow(2,(double)11);
            int day= att[den-1];
            while(comp!=0){

                int k = day & comp;
                if (k!=0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                comp = comp >> 1;

            }

        }else{
            System.out.println("Take miesto neexistuje ");
        }

    }


}
