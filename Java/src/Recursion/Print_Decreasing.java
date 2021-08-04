package Recursion;

import java.util.*;

class Print_Decreasing {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      printDecreasing(n);
    }
    public static void printDecreasing(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}
