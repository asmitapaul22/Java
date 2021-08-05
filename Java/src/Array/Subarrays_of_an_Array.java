package Array;

import java.util.Scanner;

public class Subarrays_of_an_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        String[] array=new String[n];
        for(int i=0;i<array.length;i++)
        {
           array[i]= scn.next();
        }

        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(array[k]+"\t");
                }
                System.out.println();
            }
        }


    }
}
