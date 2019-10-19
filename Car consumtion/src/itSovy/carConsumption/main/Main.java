package itSovy.carConsumption.main;

import itSovy.carConsumption.detail.Car;
import itSovy.carConsumption.detail.Color;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car Insignia = new Car(70, 6.8, "Opel", 2009, "Sedan / Liftback", 103, 'D', 4, 1596, 132, Color.BLACK);
        Car Rapid = new Car(55, 4.4, "Skoda", 2014, "Sedan / Liftback", 63, 'p', 6, 1596, 97,Color.BROWN);
        Car C4_Picasso = new Car(60, 4.7, "Citroen", 2014, "MPV", 88, 'D', 4, 1596, 103,Color.GRAY);
        Car AnonymusOne = new Car(65, 5.6, "BMW", 2020, "Sedan", 95, 'p', 6, 1000, 100,Color.SILVER);
        Car AnonymusTwo = new Car(75, 7.0, "BMW", 2018, "Van", 88, 'E', 4, 1200, 120,Color.SILVER);


        //v Jave array =       int[] pole;
        Car[] array = new Car[6];
        array[0] = Insignia;
        array[1] = Rapid;
        array[2] = C4_Picasso;
        array[3] = new Car(60, 5.1, "Suziki", 2013, "Swift", 65, 'p', 4, 900, 95,Color.BLACK);
        array[4] = AnonymusOne;
        array[5] = AnonymusTwo;

    /*
    System.out.println("Type amount of money");
    double money = input.nextDouble();

    System.out.println("\n Opel Insignia");
    Insignia.enduranceDistance(money);
    System.out.println("\n Skoda Rapid");
    Rapid.enduranceDistance(money);
    System.out.println("\n Citroen C4_Picasso");
    C4_Picasso.enduranceDistance(money);

    Insignia.printDetail();
    */

    /*
    for(int i=0;i<array.length;i++){
        System.out.println("\n");
        array[i].printDetail();
    }
    */
    /*
        for (Car temp:array) {
            temp.printDetail();

        }
        int total=0;
        for (Car temp:array){
            total += temp.getYear();
        }
        int averageYear = total/array.length;
        System.out.println(averageYear);
     */
        System.out.println("zoznam nebenzinakov\n");
        for (Car temp:array){
            if (temp.getEngine().getFuel() != 'p'){
                System.out.println("   ");
                temp.printDetail();
            }
        }

        int index=0;
        double lowestConsumption=0;
        Car lowest = Insignia;
        System.out.println("\nnajmensiu spotrebu ma\n");
        for (Car temp:array){
            if (index==0){
                lowestConsumption=temp.getFuelConsumption();
            }
            index++;
            if(lowestConsumption > temp.getFuelConsumption()){
                lowest = temp;
            }
        }

        lowest.printDetail();

        System.out.println("\nSilver farba\n");
        for (Car temp:array){
            if(temp.color == Color.SILVER || temp.color ==Color.BLACK){
                temp.printDetail();
            }
        }

        int a=80;
        a=a>>4;
        System.out.println("80>>4 = "+a);

        a=71;
        a=a<<2;
        System.out.println("71<<2 = "+a);

        a=11;
        int b= 22;
        a=a&b;
        System.out.println("11&22 = "+a);

        a=11;
        a=a|22;

        System.out.println("11|22 = "+a);

        a=~256;
        System.out.println("~256 = "+a);

        int x=31;
        int p = 0;
        while(x!=0) {
            int k = x & 1;
            if (k == 1) {
                p++;
            }
            x = x >> 1;
        }

        System.out.println(p);

        int[] pole= {1,5,2,8,9,10,3,6,7,4};
        int n = pole.length;



        for (int i =0; i<pole.length; i++){
            System.out.print(" "+pole[i]);
        }


    }
}
