package Recursion;

import java.util.*;

public class Print_Decreasing_Increasing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pdi(n);
    }
    public static void pdi(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
