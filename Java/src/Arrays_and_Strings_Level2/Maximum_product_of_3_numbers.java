package Arrays_and_Strings_Level2;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class Maximum_product_of_3_numbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i< arr.length;i++)
            arr[i]=scn.nextInt();
        int ans=maxProduct(arr);
        System.out.println(ans);
    }
    public static int maxProduct(int[] arr)
    {
        //to find min1 ,min2 ,max1,max2,max3
        int min1=Integer.MAX_VALUE;
        int min2=min1;

        int max1=Integer.MIN_VALUE;
        int max2=max1;
        int max3=max1;

        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            //max check
            if(val>=max1)
            {
                max3=max2;
                max2=max1;
                max1=val;
            }else if(val>=max2)
            {
                max3=max2;
                max2=val;
            }
            else if(val>=max3)
                max3=val;

            //min check
            if(val<=min1)
            {
                min2=min1;
                min1=val;
            }else if(val<=min2)
                min2=val;
        }
        //compare
        return Math.max(min1*min2*max1,max1*max2*max3);
    }
}
