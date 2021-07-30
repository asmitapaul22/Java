package Recursion;

import java.util.Scanner;

public class Print_Stair_Path {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printSP(n,"");
    }
    public static void printSP(int n,String ans)
    {
        if(n<0)
            return;
            if(n==0)
            {
                System.out.println(ans);
                return;
            }
        printSP(n-1,ans+1);
        printSP(n-2,ans+2);
        printSP(n-3,ans+3);
    }
}
