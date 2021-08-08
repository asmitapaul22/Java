package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Product_of_Array_except_itself {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++)
            arr[i]=scn.nextInt();
        int[] result=productOfArray(arr);
        for(int res:result)
            System.out.println(res);
    }
    public static int[] productOfArray(int[] arr)
    {
        int prod=1;
        //for left product array
        int[] leftProduct=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            prod=prod*arr[i];
            leftProduct[i]=prod;
        }
        //for right product array
        prod=1;
        int[] rightProduct=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            prod=prod*arr[i];
            rightProduct[i]=prod;
        }
        //for result array
        prod=1;
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
                result[i]=rightProduct[i+1];
            else if(i== arr.length-1)
                result[i]=leftProduct[i-1];
            else{
                prod=leftProduct[i-1]*rightProduct[i+1];
                result[i]=prod;
                prod=1;
            }

        }
        return result;
    }
}

