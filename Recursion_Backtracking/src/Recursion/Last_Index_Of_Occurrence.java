package Recursion;

import java.util.Scanner;

public class Last_Index_Of_Occurrence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=input.nextInt();
        int data=input.nextInt();
        System.out.println(lastIndex(arr,0,data));
    }
    public static int lastIndex(int[] arr,int idx,int data)
    {
        if(idx==arr.length)
            return -1;
        int liisa=lastIndex(arr,idx+1,data);
        if(liisa==-1)
        {
            if(arr[idx]==data)
                return idx;
            else return -1;
        }
        else
        {
            return liisa;
        }

    }
}
