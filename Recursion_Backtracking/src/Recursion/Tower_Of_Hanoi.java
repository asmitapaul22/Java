package Recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int d1=input.nextInt();
        int d2=input.nextInt();
        int d3=input.nextInt();
        toh(n,d1,d2,d3);
    }
    public static void toh(int n,int d1,int d2,int d3)
    {
        if(n==0)
            return;
        toh(n-1,d1,d3,d2);
        System.out.println(n+" "+"["+d1+"->"+d2+"]");
        toh(n-1,d3,d2,d1);
    }
}
