package Recursion;

import java.util.Scanner;

public class Linear_Power {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int n= input.nextInt();
        System.out.println(power(x,n));
    }
    public static int power(int x,int n)
    {
        if(n==1)
            return x;
        int mul=x*power(x,n-1);
        return mul;
    }
}
