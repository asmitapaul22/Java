package Recursion;

import java.util.Scanner;

public class Maximum_Of_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=input.nextInt();
        System.out.println(maximum(arr,0));
    }
    public static int maximum(int[] arr, int idx)
    {
        if(idx== arr.length-1)
            return arr[idx];
        int misa=maximum(arr, idx+1);
        if(misa>arr[idx])
            return misa;
        else return arr[idx];
    }
}
