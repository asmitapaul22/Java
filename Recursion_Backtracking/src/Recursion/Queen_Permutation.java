package Recursion;

import java.util.Scanner;

public class Queen_Permutation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] chess=new int[n][n];
        permutationQueens(chess,0,n);
    }
    public static void permutationQueens(int[][] chess,int qpsf,int tq)
    {
        if(qpsf==tq)
        {
            for (int i=0;i<chess.length;i++)
            {
                for (int j=0;j<chess[0].length;j++)
                {
           if(chess[i][j]==0)
               System.out.print("-\t");
                else
                    System.out.print("q"+chess[i][j]+'\t');
                }
            System.out.println();
            }
            System.out.println();
        }
        for (int i=0;i<chess.length;i++)
        {
            for (int j=0;j<chess[0].length;j++)
            {
                if(chess[i][j]==0)
                {
                    chess[i][j]=qpsf+1;
                    permutationQueens(chess,qpsf+1,tq);
                    chess[i][j]=0;
                }
            }
        }
    }}
