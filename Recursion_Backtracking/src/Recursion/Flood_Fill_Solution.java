package Recursion;

import java.util.Scanner;

public class Flood_Fill_Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[n][m];

        for(int i=0;i< arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scan.nextInt();
            }

        }
        boolean[][] visited=new boolean[n][m];

        Flood_Fill_Solution(arr,0,0,"",visited);
    }
    public static void Flood_Fill_Solution(int[][] maze,int row,int col,String path,boolean[][] visited)
    {
        if(row<0||col<0||row==maze.length||col==maze[0].length||maze[row][col]==1||visited[row][col]==true)
        {
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1)
        {
            System.out.println(path);
            return;
        }
        visited[row][col]=true;
        Flood_Fill_Solution(maze,row-1,col,path+"t",visited);//top
        Flood_Fill_Solution(maze,row,col-1,path+"l",visited);//left
        Flood_Fill_Solution(maze,row+1,col,path+"b",visited);//bottom
        Flood_Fill_Solution(maze,row,col+1,path+"r",visited);//right
        visited[row][col]=false;
    }
}
