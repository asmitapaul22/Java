package Recursion;

import java.util.Scanner;

public class Print_ZigZag {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pzz(n);
    }
    public static void pzz(int n)
    {
        if(n==0)
            return;
        System.out.println(n+" ");
        pzz(n-1);
        System.out.println(n+" ");
        pzz(n-1);
        System.out.println(n+" ");


    }
}
