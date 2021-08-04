package Recursion;

import java.util.Scanner;

public class N_Queens_Problem {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] chess=new int[n][n];
        printNQueens(chess,"",0);
    }
    public static void printNQueens(int[][] chess,String qsf,int row)
    {
        if(row==chess.length)
        {
            System.out.println(qsf+".");
            return;
        }
        for(int col=0;col<chess.length;col++)
        {
            if(isItASafePlaceFortheQueen(chess,row,col)==true)
            {
                chess[row][col]=1;
                printNQueens(chess,qsf+row+"-"+col+",",row+1);
                chess[row][col]=0;
            }

        }
    }
    public static boolean isItASafePlaceFortheQueen(int[][] chess,int row,int col)
    {
        //for checking in vertical direction if the wueen is safe to place or not
        for(int i=row-1,j=col;i>=0;i--)
        {
            if(chess[i][j]==1)
                return false;
        }
        //for checking in 1 diagonal direction if the queen is safe to place or not
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j-- )
        {
            if(chess[i][j]==1)
                return false;
        }
        //for checking in 2nd diagonal direction if the queen is safe to be placed or not
        for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++)
        {
            if(chess[i][j]==1)
                return false;
        }
        return true;
    }
}
