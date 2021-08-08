package Arrays_and_Strings_Level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Majority_ElementII {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        ArrayList<Integer> res=Majority_ElementII(arr);
        System.out.println(res);
    }
    public static ArrayList<Integer> Majority_ElementII(int[] arr)
    {
        ArrayList<Integer> potentialCandidate=new
                ArrayList<>();
        int val1=arr[0];
        int count1=1;
        int val2=arr[0]; //asignn any random value
        int count2=0;
        int i=1;
        while(i<arr.length)
        {
            if(arr[i]==val1)
            count1++;
            else if(arr[i]==val2)
                count2++;
            else
            {
                if(count1==0)
                {val1=arr[i]; count1=1;}
                else if(count2==0)
                {val2=arr[i]; count2=1;}
                else
                {count1--; count2--;}
            }
            i++;
        }
        //val1 and val2 are potential candidate --now to check if they exist for >n/3 times in the given array or not
        if(isGreaterThanNby3(arr,val1)==true)
            potentialCandidate.add(val1);
        if(val1!=val2&&isGreaterThanNby3(arr,val2)==true)
            potentialCandidate.add(val2);


        return potentialCandidate;
    }
    public static boolean isGreaterThanNby3(int[] arr,int val)
    {
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==val)
                count++;
        }

            return count>arr.length/3;
    }
}
