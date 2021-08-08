package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Container_with_most_water {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int maxArea=containerWithMostWater(arr);
        System.out.println(maxArea);
    }
    public static int containerWithMostWater(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        int area=0;
        int finalArea=0;
        while(i<j)
        {
            int width=j-i;
            int height=Math.min(arr[i],arr[j]);
            area=width*height;
            if(area>finalArea)
                finalArea=area;
            if(height==arr[i])
                i++;
            else j--;
        }
        return finalArea;
    }
}
