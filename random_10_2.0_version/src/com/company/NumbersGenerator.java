package com.company;

import java.util.ArrayList;
import java.util.Random;

public class NumbersGenerator {

    Random random = new Random();

                                                                            //PRVY SPOSOB VYGENEEROVANIA POLA CISEL KTORE SA NEOPAKUJU TO AKO GENEROVANIM SAMOTNYCH CISIEL JEDEN PO DRUHOM
    public int[] generatingByCreatingNumbs(int limitNumber){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] array = new int[limitNumber];

        for (int a=0; a<limitNumber;a++){
            int temp = random.nextInt(limitNumber)+1;
            if (arrayList.contains(temp)){
                while (arrayList.contains(temp)){
                    temp = random.nextInt(limitNumber)+1;
                }
                arrayList.add(temp);
            }else{
                arrayList.add(temp);
            }

            array[a] = arrayList.get(a);
        }
           return array;
    }
                                                                                    //DRUHY SPOSOB VYGENEROVANIA POLA CISEL KTORE SA NEOPAKUJU A TO NAHODNYM POPREHADZOVANIM UZ EXISTUJUCICH
    public int[] generatingByReplacement(int numberOfReplacement,int... pole){
        for (int a=0;a<numberOfReplacement;a++){

            int randIdx = random.nextInt(pole.length);
            int randIdx2 = random.nextInt(pole.length);

            while(randIdx == randIdx2){
                randIdx = random.nextInt(pole.length);
                randIdx2 = random.nextInt(pole.length);
            }

            int temp = pole[randIdx];
            pole[randIdx] = pole[randIdx2];
            pole[randIdx2] = temp;

        }
        return pole;
    }
                                                                                    //METHODA NA VYPIS POLA
    public void printArray(int[] array){
        System.out.println("\n");
        System.out.println("PRINTING NUMBERS");
        System.out.println("\n");
        for (int result:array) {
            System.out.println("        "+result);
        }
        System.out.println("\n");
        System.out.println("PRINTING NUMBERS");
        System.out.println("\n");
    }
                                                                                //METHODA NA POPREHADZOVANIE CISEL V POLI PODLA TOHO ABY NEBOLI PRI SEBE CISLA S ROZDIELOM 1
    public int[] exchangeNumbersByRules(int[] array){
        for (int a=0;a<array.length-1;a++){
            int index = random.nextInt(array.length);
            while (index<=a) {
                index = random.nextInt(array.length);       //index cisla ktory sa vymeni s tym na ktorom prave cyklus je MUSI BYT(while) vacsi ako index na ktorom je kvoli tomu aby neprehadzoval uz prejdene cisla
            }

            if (array[a+1]-1 ==array[a] || array[a+1]+1 == array[a]){  //ak najde par cisel medzi ktorymi je rozdiel 1 tak sa pokusa o vymenu
                if (a==array.length-2){                                 //ak nasiel par a potrebuje vymenu ale je na konci pola to znamena ze vymena musi nastat z cisel uz prejdenych
                    int randNew = random.nextInt(array.length-2);
                    while(true){
                        if (array[a]+1==array[randNew] || array[a]-1==array[randNew]){
                            //tento pripad znamena ze pri vymene cisiel vznikne znova par
                        }else{          //potencialna vymena
                            try{
                                if (       array[randNew-1]+1 == array[a+1]                 //moze nastat outOfIndex pri 0 index
                                        || array[randNew+1]+1 == array[a+1]
                                        || array[randNew-1]-1 == array[a+1]
                                        || array[randNew+1]-1 == array[a+1]
                                ){              //toto ifko je na to aby sme predisli vzniku paru na mieste z ktoreho berieme nove cislo
                                }else{
                                    //tento pripad je najidealnejsi lebo nevznikne par ani na novom mieste ani na tom skadial bolo cislo zobrane
                                    int temp = array[a+1];
                                    array[a+1] = array[randNew];
                                    array[randNew] = temp;
                                    break;
                                }
                            }catch (ArrayIndexOutOfBoundsException e){
                                System.out.println("INDEX 0 "+e.getMessage());
                            }
                        }
                        randNew = random.nextInt(array.length-2);
                    }
                }else{
                    if (array[a]-1 == array[index] || array[a]+1 == array[index]){          //vymena prejde iba ak cisla nemaju rozdiel 1 inak sa opakuje iteracia
                        a = a-1;
                    }else{
                        int temp = array[a+1];
                        array[a+1] = array[index];
                        array[index] = temp;
                    }
                }
            }
        }

        return array;

    }
}
