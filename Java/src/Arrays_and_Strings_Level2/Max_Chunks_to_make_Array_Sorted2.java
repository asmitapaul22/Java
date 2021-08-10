package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Max_Chunks_to_make_Array_Sorted2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i< arr.length;i++)
            arr[i]=scn.nextInt();
        int ans=maxChunks(arr);
        System.out.println(ans);
    }
    public static int maxChunks(int[] arr)
    {
        //generate Right Min
        int[] Rmin=new int[arr.length+1];
        Rmin[arr.length]=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            Rmin[i]=Math.min(Rmin[i+1],arr[i]);
        }
        //iterate on the array and manage left max as well as chunks
int leftMax=Integer.MIN_VALUE;
    int count=0;
    for(int i =0;i<arr.length;i++)
    {
        leftMax=Math.max(leftMax,arr[i]);
        if(leftMax<=Rmin[i+1])
            count++;
    }
    return count;}
}
