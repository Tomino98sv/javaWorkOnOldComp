
public class BubleSort {

    private int[] array;
    public static int countUse=0;

    public BubleSort(int...numb){
        int count=0;
        for (int a:numb){
            count++;
        }
        array = new int[count];
        count=0;
        for (int a:numb){
            array[count] = a;
            count++;
        }
    }

    public void countUseNull(){
        countUse=0;
    }


    public void printArray(){
        for (int a:array){
            System.out.print(" "+a);
        }
    }

    public int[] bubleSortingwithR(){
        countUse++;
        int[] pole=array;

        for (int a=0;a<pole.length-1;a++){
            for (int b=0;b<pole.length-a-1;b++){
                if (pole[b]>pole[b+1]){
                    int temp = pole[b];
                    pole[b]=pole[b+1];
                    pole[b+1]=temp;
                }
            }
        }

        return pole;
    }

    public void bubleSorting(){
        countUse++;
        for (int a=0;a<array.length-1;a++){

            for (int b=0;b<array.length-a-1;b++){
                if (array[b]>array[b+1]){
                    int temp = array[b];
                    array[b]=array[b+1];
                    array[b+1]=temp;
                }
            }
        }

    }
}
