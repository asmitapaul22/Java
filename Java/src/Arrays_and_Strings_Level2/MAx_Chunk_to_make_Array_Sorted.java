package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class MAx_Chunk_to_make_Array_Sorted {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++)
            arr[i]=scn.nextInt();
        int answer=maxChunksToSorted(arr);
        System.out.println(answer);
    }
    public static int maxChunksToSorted(int[] arr)
    {
        int max=0;
        int chunkCount=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(arr[i],max);
            if(max==i)
               chunkCount++;
        }
        return chunkCount;
    }
}
