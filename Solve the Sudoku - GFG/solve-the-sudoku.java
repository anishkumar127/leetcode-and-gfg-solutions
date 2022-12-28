//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int sudoku[][])
    {
        // add your code here
        return (sudokuSolver(sudoku, 0,0));
    }
    
    
    public static boolean sudokuSolver(int [][] sudoku, int row , int col){
        // base case
        if(row==9 && col==0) return true;

        int nextRow = row, nextCol = col+1;

        if(col+1==9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(sudoku[row][col]!=0){
       return  sudokuSolver(sudoku,nextRow,nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;

                if(sudokuSolver(sudoku,nextRow,nextCol)){ // solution exists
                    return true;
                }

                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    //Function to print grids of the Sudoku.
    static void printGrid (int sudoku[][])
    {
        // add your code here
        for(int[] arr:sudoku){
            for(int val:arr){
                System.out.print(val+" ");
            }
            // System.out.println();
        }
    }
     private static boolean isSafe(int[][] sudoku, int row , int col, int digit){
        // column
        for(int i=0; i<=8; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
       // row
        for(int j=0; j<=8; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        // grid 3*3
        int sRow = ((row/3)*3);
        int sCol = ((col/3)*3);

        for(int i=sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
}