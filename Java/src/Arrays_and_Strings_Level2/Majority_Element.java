package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scn.nextInt();
        }
        printMajorityElement(arr);
    }
    public static void printMajorityElement(int[] arr)
    {
        //find the potential candidate for majority
        int value=potentialCandidate(arr);

        //find frequency of the potential candidate
        int freq=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
                freq++;

        }
        if(freq>arr.length/2)
        {
            System.out.println(value);
        }else System.out.println("No majority element");
    }
    public static int potentialCandidate(int[] arr)
    {
        int val=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==val)
                //same element increment the count
                count++;
        else
            //different element then map with val mean decrement the count
            count--;
            if(count==0)
            {
                val=arr[i];
                count = 1;
            }
        }
        return val;
    }
}
