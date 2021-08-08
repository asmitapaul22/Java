package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Range_Addition {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int length=scn.nextInt();
        int noOfQueries=scn.nextInt();
        int[][] queries=new int[noOfQueries][3];
        for(int i=0;i<queries.length;i++)
        {
            queries[i][0]=scn.nextInt();
            queries[i][1]=scn.nextInt();
            queries[i][2]=scn.nextInt();
        }
        int[] response=getModifiedArray(length,queries);
        for(int i=0;i<response.length;i++)
            System.out.println(response[i]);
    }
    public static int[] getModifiedArray(int length,int[][] queries)
    {

        int[] modifiedArray=new int[length];
        for(int i=0;i< queries.length;i++)
        {
            int start=queries[i][0];
            int end=queries[i][1];
            int inc=queries[i][2];
            for(int j=start;j<=end;j++)
            {
                int sum=modifiedArray[j];
                sum+=inc;
                modifiedArray[j]=sum;

            }        }
        return modifiedArray;
    }
}
