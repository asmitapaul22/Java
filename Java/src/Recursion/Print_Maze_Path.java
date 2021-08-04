package Recursion;

import java.util.Scanner;

public class Print_Maze_Path {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        printMazePath(1,1,n,m,"");
    }
    public static void printMazePath(int sr,int sc,int dr,int dc,String path)
    {
        if(sc<dc)
        {
            printMazePath(sr,sc+1,dr,dc,path+"h");
        }
        if(sr<dr)
        {
            printMazePath(sr+1,sc,dr,dc,path+"v");
        }
        if(sr==dr&&sc==dc)
        {
            System.out.println(path);
        }
    }
}
