package Arrays_and_Strings_Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Merge_Intervals {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //input format
        int n=scn.nextInt();
        int input[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            input[i][0]=scn.nextInt();
            input[i][1]=scn.nextInt();

        }
        //output format
        int[][]output=mergeIntervals(input);

        System.out.print("[");
        for(int arr[] :output)
            System.out.println(Arrays.toString(arr));
        System.out.print("]");
    }
    public static int[][] mergeIntervals(int[][] Intervals)
    {
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list =new ArrayList<>();
        for(int[] interval:Intervals)
        {
            if(list.size()==0)
                list.add(interval);
            else{
                int prevInterval[]=list.get(list.size()-1);
                if(interval[0]<prevInterval[1])
                {
                    prevInterval[1]=Math.max(prevInterval[1],interval[1]);
                }else{
                    list.add(interval);
                }
            }

        }
        return list.toArray(new int[list.size()][]);
    }
}
