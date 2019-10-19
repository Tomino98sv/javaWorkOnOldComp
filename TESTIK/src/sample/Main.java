package sample;

import java.util.Random;

public class Main{
    public static void main(String[] args) {

        Random rand = new Random();
        String array[] = new String[15];
        for (int i=0;i<array.length;i++){
            String number="";
            for (int a=0;a<4;a++){
                int num=rand.nextInt(10);
                number+=String.valueOf(num);
            }
            array[i]=number;
            System.out.print(" "+array[i]);
        }

        System.out.println("\n");
            String generatedNum="";
            boolean matchNotFound=false;

            while (!matchNotFound){

                matchNotFound=true;
                for (int i=0;i<4;i++){
                    int num=rand.nextInt(10);
                    generatedNum+=String.valueOf(num);
                }
                for (String numb: array) {
                    if (numb.equals(generatedNum)){
                        matchNotFound=false;
                    }
                }
            }
            System.out.println(generatedNum);
        System.out.println(generatedNum.equals(generatedNum));
        }
}
