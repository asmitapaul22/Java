package Array;

import java.util.Scanner;

public class Difference_of_Two_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1 =scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        int n2 =scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }
        //because in question,it is mentioned that n2>n1
        int[] diff=new int[n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
        int carry=0;
        while (k>=0)
        {
            int d=0;
            int arr1Val=i>=0?arr1[i]:0;
            if(arr2[j]+carry>=arr1Val)
            {
                d=arr2[j]+carry-arr1Val;
                carry=0;
            }
            else {
                d=arr2[j]+carry+10-arr1Val;
                carry=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<diff.length)
        {
            if(diff[idx]==0)
                idx++;
            else
                break;
        }
        //when 1000-1000=0000 400-400=000 999-999 1-1
        if(idx == diff.length) {
            System.out.println("Diff array is :");
            System.out.println(diff[idx-1]);
        }
        else {
            System.out.println("Diff array is :");
            while(idx<diff.length) {
                System.out.print(diff[idx]+"\t");
                idx++;
            }
        }
    }

}
