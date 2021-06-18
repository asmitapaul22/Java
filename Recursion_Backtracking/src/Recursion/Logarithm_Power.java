package Recursion;

import java.util.Scanner;

public class Logarithm_Power {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        int n=input.nextInt();
        System.out.println(power(x,n));
    }
    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
        int xbpn2= power(x,n/2);
        int xn=xbpn2*xbpn2;
        if(n%2==1)
            xn=xn*x;

        return xn;

    }
}
