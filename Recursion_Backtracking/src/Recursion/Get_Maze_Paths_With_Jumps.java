package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Paths_With_Jumps {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> paths=getMazePathsWithJump(1,1,n,m);
        System.out.println(paths);

    }
    public static ArrayList<String> getMazePathsWithJump(int sr,int sc,int dr,int dc)
    {
        if(dr==sr && dc==sc)
        {
            ArrayList<String > baseres=new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        ArrayList<String> paths=new ArrayList<>();
        //horizontal jumps
        for(int jump=1;jump<=dc-sc;jump++)
        {
            ArrayList<String> hpaths=getMazePathsWithJump(sr,sc+jump,dr,dc);
            for (String hpath:hpaths)
                paths.add("h"+jump+hpath);

        }
        //vertical jumps
        for(int jump=1;jump<=dr-sr;jump++)
        {
            ArrayList<String> vpaths=getMazePathsWithJump(sr+jump,sc,dr,dc);
            for (String vpath:vpaths)
                paths.add("v"+jump+vpath);

        }
        //diagonal jumps
        for(int jump=1;jump<=dr-sr&&jump<=dc-sc;jump++)
        {
            ArrayList<String> dpaths=getMazePathsWithJump(sr+jump,sc+jump,dr,dc);
            for (String dpath:dpaths)
                paths.add("d"+jump+dpath);

        }
        return paths;
    }
}
