package Recursion;

import java.util.Scanner;

public class Print_Maze_Path_With_Jumps {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        printMazePathWithJumps(1,1,n,m,"");
    }
    public static void printMazePathWithJumps(int sr,int sc,int dr,int dc,String path)
    {//base case
        if(dr==sr&&dc==sc)
        {System.out.println(path);
        return;}

        //horizontal jump
        for (int jump=1;jump<=dc-sc;jump++)
        {
            printMazePathWithJumps(sr,sc+jump,dr,dc,path+"h"+jump);

        }
        //vertical jump
        for (int jump=1;jump<=dr-sr;jump++)
        {
            printMazePathWithJumps(sr+jump,sc,dr,dc,path+"v"+jump);

        }
        //diagonal jump
        for (int jump=1;jump<=dc-sc&&jump<=dr-sr;jump++)
        {
            printMazePathWithJumps(sr+jump,sc+jump,dr,dc,path+"d"+jump);

        }
    }
}
