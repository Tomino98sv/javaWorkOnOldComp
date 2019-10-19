package com.company;

public class Main {
    //we need new sudoku
    // 1,0,0,0,2,6,0,3,9
    // 0,0,8,7,0,0,6,0,1
    // 0,0,0,0,0,0,2,0,0
    // 4,0,0,9,0,0,5,1,6
    // 0,0,0,0,0,0,0,0,0
    // 7,9,6,0,0,4,0,0,8
    // 0,0,9,0,0,0,0,0,0
    // 3,0,1,0,0,2,9,0,0
    // 6,4,0,1,8,0,0,0,3
    public static int sudoku[][] = {
            {1,0,0,0,2,6,0,3,9},
            {0,0,8,7,0,0,6,0,1},
            {0,0,0,0,0,0,2,0,0},
            {4,0,0,9,0,0,5,1,6},
            {0,0,0,0,0,0,0,0,0},
            {7,9,6,0,0,4,0,0,8},
            {0,0,9,0,0,0,0,0,0},
            {3,0,1,0,0,2,9,0,0},
            {6,4,0,1,8,0,0,0,3}
    };
    public static Candidates candidates[][] = new Candidates[9][9];
    public static void main(String[] args){
        boolean isFinished = false;
        while(!isFinished){
            //solve sudoku
            //i should be row, j column
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++) {
                    // if cell is solved continue
                    if (sudoku[i][j] != 0) {
                        continue;
                    }
                    //System.out.println("Candidates for i: " + i + ", j: " + j);
                    // test for numbers from 1 to 9
                    Candidates can = new Candidates();
                    for (int candidate = 1; candidate < 10; candidate++) {
                        //System.out.println("Checking candidate: " + candidate);
                        //test entire row
                        boolean existsInRow = false;
                        for (int column = 0; column < 9; column++) {
                            if (sudoku[i][column] == candidate) {
                                System.out.println("exists in row");
                                existsInRow = true;
                                break;
                            }
                        }
                        //test entire column
                        boolean existsInCol = false;
                        for (int row = 0; row < 9; row++) {

                            if (sudoku[row][j] == candidate) {
                                System.out.println("exists in column");
                                existsInCol = true;
                                break;
                            }
                        }
                        //check in cell
                        int[] bounds = getBounds(i, j);
                        boolean existsInCell = false;
                        for (int cellX = bounds[0]; cellX < bounds[0] + 3; cellX++) {
                            for (int cellY = bounds[1]; cellY < bounds[1] + 3; cellY++) {
                                if (sudoku[cellX][cellY] == candidate) {
                                    System.out.println("exists in cell");
                                    existsInCell = true;
                                    break;
                                }
                            }
                        }
                        if (!existsInCell && !existsInCol && !existsInRow) {
                            can.push(candidate);
                        }
                    }
                    if(can.getSize() == 0) {
                        System.out.println("Wtf");
                    }
                    //  System.out.print("Candidates: ");
                    //   for(int cand:can.getCandidates()){
                    //       System.out.print(cand +", ");
                    //   }
                    //  System.out.println();
                    if(can.getSize() == 1){
                        System.out.println("Found candidate: " + can.getCandidates().get(0));
                        sudoku[i][j] = can.getCandidates().get(0);
                    }
                }
            }
            printSudoku(sudoku);
            //System.out.println("Check if finished");
            isFinished = isSudokuSolved(sudoku);
        }

    }

    public static void printSudoku(int[][] sudoku){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("| " + sudoku[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isSudokuSolved(int[][] arr){
        //check if is solved
        int countOfUnsolved = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(sudoku[i][i] == 0){
                    countOfUnsolved++;
                }
            }
        }
        System.out.println("Count of unsolved cells in sudoku: " + countOfUnsolved);
        return countOfUnsolved == 0;
    }
    public static int[] getBounds(int col, int row){
        int colBound = 0, rowBound = 0;
        if(col<3){
            colBound = 0;
        }else if(col < 6){
            colBound = 3;
        }else{
            colBound = 6;
        }

        if(row<3){
            rowBound = 0;
        }else if(col < 6){
            rowBound = 3;
        }else{
            rowBound = 6;
        }
        return new int[]{colBound, rowBound};
    }
}