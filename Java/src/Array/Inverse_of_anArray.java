package Array;

import java.util.Scanner;

public class Inverse_of_anArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        the range of input values will be 0<=array[i]< n
        int n=scn.nextInt();
        int[] array=new int[n];
        int[] arrayInverse=new int[n];
        for(int i=0;i< array.length;i++)
        {
            array[i]=scn.nextInt();
        }
        for(int i=0;i<array.length;i++)
        {
            int value=array[i];
            arrayInverse[value]=i;
        }
        for (int inv:arrayInverse)
            System.out.print(inv+"\t");
    }
}
