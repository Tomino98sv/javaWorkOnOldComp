import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random random = new Random();
        Main main = new Main();

        int [][] population = new int [10][10];
        int [][] knapsack = new int [2][10];
        int [][] indexAndFitness = new int [10][2];
        int [] price = {5,10,12,36,45,4,50,11,27,2};
        int [] weight = {50,21,18,3,9,12,36,3,8,4};

        knapsack[0] = price;
        knapsack[1] = weight;


        int individualCount=0;
        while (individualCount!=10){
            for (int a=0; a<population[individualCount].length;a++){
                population[individualCount][a]=random.nextInt(2);
            }
            if (main.canBeBorn(population[individualCount], knapsack)){
                //tu dam index a hodnotu
                int[] temp = {individualCount,main.fitness(population[individualCount],knapsack)};
                indexAndFitness[individualCount] = temp;
                individualCount++;
            }
        }

        main.sortArray(indexAndFitness);
        
    }

    public int fitness(int [] individual, int [][] knapsack){
        int fitness=0;
        for (int a=0;a<individual.length;a++){
            fitness+=individual[a]*knapsack[0][a];
        }
        return fitness;
    }

    public boolean canBeBorn(int [] individual, int [][] knapsack){
        int weight=0;
        for (int a=0;a<individual.length;a++){
            weight+=individual[a]*knapsack[1][a];
            if (weight>120){
                return false;
            }
        }
        return true;
    }

    public void sortArray(int [][] indexAndFitness){

        int n = indexAndFitness.length;
        int [] temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(indexAndFitness[j-1][1] < indexAndFitness[j][1]){
                    //swap elements
                    temp = indexAndFitness[j-1];
                    indexAndFitness[j-1] = indexAndFitness[j];
                    indexAndFitness[j] = temp;
                }

            }
        }

    }

}
