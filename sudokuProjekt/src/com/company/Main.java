package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     int[] realPole = {
             1,0,0, 0,2,6, 0,3,9,
             0,0,8, 7,0,0, 6,0,1,
             0,0,0, 0,0,0, 2,0,0,

             4,0,0, 9,0,0, 5,1,6,
             0,0,0, 0,0,0, 0,0,0,
             7,9,6, 0,0,4, 0,0,8,

             0,0,9, 0,0,0, 0,0,0,
             3,0,1, 0,0,2, 9,0,0,
             6,4,0, 1,8,0, 0,0,3
     };

     String realEnter = "100026039008700601000000200400900516000000000796004008009000000301002900640180003";
     SudokuSolution sol1 = new SudokuSolution(realPole);
     sol1.solveSudoku();
     sol1.printSudoku();


    }
}


//    int[] realPole = {
//            1,0,0, 0,2,6, 0,3,9,
//            0,0,8, 7,0,0, 6,0,1,
//            0,0,0, 0,0,0, 2,0,0,
//
//            4,0,0, 9,0,0, 5,1,6,
//            0,0,0, 0,0,0, 0,0,0,
//            7,9,6, 0,0,4, 0,0,8,
//
//            0,0,9, 0,0,0, 0,0,0,
//            3,0,1, 0,0,2, 9,0,0,
//            6,4,0, 1,8,0, 0,0,3
//    };
