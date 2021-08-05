package Array;

import java.util.Scanner;

public class Rotate_an_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int noOfRotation=scn.nextInt();

rotate(arr,noOfRotation);
    }
    public static void reverse(int[] arr,int i,int j)
    {

        int li=i;
        int ri=j;
        while(li<ri)
        {
            int temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }

    }
    public static void rotate(int[] arr, int noOfRotation)
    {
        //as the value of array from rotation k=0 and k=arr.length is same
        //suppose arr.length=8---so k=0 and k=8 both will be same by doing modulus we can find k=25 which will  be equal to k=1 as noOfRotaton=25%8=1
        noOfRotation=noOfRotation% arr.length;
        //if k=-1 then noOfRotation=-1+8=7 as the value of k=-1 and k=7 are equal therefore to handle -ve values
        if(noOfRotation<0)
            noOfRotation=noOfRotation+arr.length;
        //part1
        reverse(arr,0, arr.length-noOfRotation-1);
        //part2
        reverse(arr, arr.length-noOfRotation,arr.length-1);
        //all
        reverse(arr,0,arr.length-1);
        for(int val:arr)
            System.out.print(val+"\t");
    }
}
