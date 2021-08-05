package Array;

import java.util.Scanner;

public class Binary_Search_Algorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n=scanner.nextInt();
        System.out.println("Enter a sorted array");
        int[] array=new int[n];
        for (int i=0;i<array.length;i++)
            array[i]=scanner.nextInt();
        System.out.println("Enter the data to be searched");
        int data= scanner.nextInt();
        int low=0;
        int high=array.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(data>array[mid])
            {
                low=mid+1;
            }
            else if(data<array[mid])
            {
                high=mid-1;
            }else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);

    }
}
