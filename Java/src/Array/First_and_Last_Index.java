package Array;

import java.util.Scanner;

public class First_and_Last_Index {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int data= scn.nextInt();
        int low=0;
        int high= arr.length-1;
        int lastIndex=0;
        int firstIndex=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(data>arr[mid])
            {
                low=mid+1;
            }else if(data<arr[mid])
            {
                high=mid-1;
            }else{
                firstIndex=mid;
                high=mid-1;
            }
        }
        System.out.println(firstIndex);


        low=0;
        high= arr.length-1;
        lastIndex=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(data>arr[mid])
            {
                low=mid+1;
            }else if(data<arr[mid])
            {
                high=mid-1;
            }else{
                lastIndex=mid;
                low=mid+1;
            }
        }
        System.out.println(lastIndex);
    }
}
