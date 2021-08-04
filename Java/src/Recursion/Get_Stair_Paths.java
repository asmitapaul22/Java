package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Stair_Paths {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int stair=scn.nextInt();
        ArrayList<String> paths=getStairPaths(stair);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairPaths(int n)
    {
        //base conditions
        if(n==0)
        {
            ArrayList<String> baseres=new ArrayList<>();
            baseres.add("");
            return baseres;
        }else if(n<0)
        {
            ArrayList<String> baseres=new ArrayList<>();
            return baseres;
        }


        ArrayList<String> paths1=getStairPaths(n-1);
        ArrayList<String> paths2=getStairPaths(n-2);
        ArrayList<String> paths3=getStairPaths(n-3);
        ArrayList<String> paths=new ArrayList<>();
        for(String path:paths1)
            paths.add(1+path);
        for(String path:paths2)
            paths.add(2+path);
        for(String path:paths3)
            paths.add(3+path);
        return paths;
    }
}
