package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Paths {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m= scn.nextInt();
        ArrayList<String> paths=getMazePaths(1,1,n,m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc)
    {
        if(sr==dr&&sc==dc)
        {
            ArrayList<String> baseres=new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        ArrayList<String> Hpaths=new ArrayList<>();

        ArrayList<String> Vpaths=new ArrayList<>();
        if(sc<dc)
            Hpaths=getMazePaths(sr,sc+1,dr,dc);
        if(sr<dr)
        Vpaths=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> paths=new ArrayList<>();
        for(String Hpath:Hpaths)
            paths.add("h"+Hpath);
        for(String Vpath:Vpaths)
            paths.add("v"+Vpath);
        return paths;
    }
}
