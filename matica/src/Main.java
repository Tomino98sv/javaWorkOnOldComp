import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(5);
        st.pop();
        st.pop();
        st.push(4);
        st.push(8);
        System.out.println("Cisla z stacku:"+st+"\n");
        System.out.println("Z cyklu");
        for (int x: st) {
            System.out.println(x);
        }

        int[][] array = new int[3][3];
        int[][] arrayTranspozic = new int[3][3];

        for (int i=0; i<array.length; i++){
            for (int a=0; a<array[i].length; a++){
                System.out.println("Enter number: ["+i+"]["+a+"]");
                array[i][a]=input.nextInt();
            }
        }

        System.out.println("toten jeho rotate");
        rotateMatric(array.length, array);

        for (int i=0; i<array.length; i++){
            System.out.println();
            for (int a=0; a<array[i].length; a++){
                System.out.print(" "+array[i][a]);
                arrayTranspozic[a][i]=array[i][a];
            }
        }

        System.out.println("\n");


        for (int i=0; i<arrayTranspozic.length; i++){
            System.out.println();
            for (int a=0; a<arrayTranspozic[i].length; a++){
                System.out.print(" "+arrayTranspozic[i][a]);
            }
        }

    }

    static void rotateMatric(int N, int mat[][]){
        System.out.println("\npred zoradenim");
        for (int i=0; i<mat.length; i++){
            System.out.println();
            for (int a=0; a<mat[i].length; a++){
                System.out.print(" "+mat[i][a]);
            }
        }

        for (int m= 0; m< N /2; m++){
            for (int n = m;n < N-m-1;n++){
                int temp = mat[m][n];

                //move value from right to top
                mat[m][n] = mat[n][N-1-m];

                //move value from bottom to right
                mat[n][N-1-m] = mat[N-1-m][N-1-n];

                //move values from left to bottom
                mat[N-1-m][N-1-n] = mat[N-1-n][m];

                //assign temp to left
                mat[N-1-n][m] = temp;

            }
        }
        System.out.println("\npo zoradenim");

        for (int i=0; i<mat.length; i++){
            System.out.println();
            for (int a=0; a<mat[i].length; a++){
                System.out.print(" "+mat[i][a]);
            }
        }

        System.out.println();
    }
}
