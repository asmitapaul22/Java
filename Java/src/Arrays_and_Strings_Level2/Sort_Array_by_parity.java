package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Sort_Array_by_parity {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int[] result=sortByParity(arr);
        for(int res:result)
            System.out.print(res+"\t");
    }
    public static int[] sortByParity(int[] arr)
    {
        int i=0; //first unsolved
        int j=0; //first odd
        for(int k=0;k<arr.length-1;k++)
        {
            if(arr[i]%2!=0)//odd
                i++;
            else{
                //even
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
        return arr;
    }

}
