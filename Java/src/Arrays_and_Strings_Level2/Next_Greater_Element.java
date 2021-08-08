package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
       int ans=nextGreaterElement(n);
       System.out.println(ans);
    }
    public static int nextGreaterElement(int n)
    {
        int number=0;
        char[] array=String.valueOf(n).toCharArray();
        //to find the first dip
        int i=array.length-2;
        while(i>=0&& array[i]>=array[i+1])
        {
            i--;
        }
        if(i==-1)
            return -1;

        //find the just next greater number than the ith index number
        int k=array.length-1;
        while(array[i]>array[k])
            k--;

        //swap ith and kth index value
        char temp=array[i];
        array[i]=array[k];
        array[k]=temp;

        //concatenate the values till ith index
        String result="";
        for(int j=0;j<=i;j++)
            result+=array[j];
        //concatenate the values from i+1th index to the end in reverse order
        for(int j=array.length-1;j>i;j--)
            result+=array[j];
        long val = Long.parseLong(result);
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }


    }


