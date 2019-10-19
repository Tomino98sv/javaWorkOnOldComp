import java.util.Scanner;

class Kokotko {

    static String typing;
    int cislo;

    static void staticWord(String word){
        typing = word;
    }

    void nonstaticPrint(){
        System.out.println("hahahaha i am non static");
    }

    static {
        typing="INICIALIZOVAL SOM TO ZO STATIC BLOCKU";
        staticWord("Vypis z classy");
        System.out.println(typing);
        Kokotko velky = new Kokotko();
        velky.nonstaticPrint();

    }


}


public class Main {

    //The static method can not use non static data member or call non-static method directly.
    //this and super cannot be used in static context.
    static{
        System.out.println("na pociatku bolo slovo a to slovo bolo u Boha");
        BubleSort pole0 = new BubleSort(1,2,3,0);
        pole0.bubleSorting();
        Kokotko.staticWord("ahojte");
        Kokotko maly = new Kokotko();
        maly.cislo=0;
    };

    private static String word= "Nemenne";

    public static void main(String[] args) {
        System.out.println("a potom bol main");
	// write your code here
        Scanner input = new Scanner(System.in);
        Main.varArgs(1,2,3,4,5,6,7,8,9,10);
        BubleSort pole = new BubleSort(8,6,2,4,5,8,2,1,7,9,3,2,5,1,7,5,3,9,7,1,6,8,9,2,0,0,0,4,7,5);
        pole.bubleSorting();
        BubleSort pole2 = new BubleSort(5,8,2,6,8,8);
        pole2.bubleSorting();
        int[] pole3 = pole2.bubleSortingwithR();

        System.out.println(BubleSort.countUse);
        System.out.println(word);
        Main.notmutableWord();
        System.out.println(word);
        Main nonstatic = new Main();
        nonstatic.mutableWord();
        System.out.println(word);
    }

    public static void varArgs(int...number){
        for (int a:number){
            System.out.print(" "+a);
        }
    }

    public static void notmutableWord(){
        word = "Ahoj";
    }

    public void mutableWord(){
        word="nieee";
    }
}
