package Recursion;

import java.util.Scanner;

public class Display_Array_Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=input.nextInt();
        reverse(arr,0);
    }
    public static void reverse(int[] arr,int idx)
    {
        if(idx== arr.length)
            return;
        System.out.println(arr[arr.length-1-idx]);
        reverse(arr,idx+1);
    }
}
