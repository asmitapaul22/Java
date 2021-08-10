package Arrays_and_Strings_Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Meeting_Rooms {
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
        boolean bool=meetingRooms(input);
        System.out.println(bool);
    }
    public static boolean meetingRooms(int[][] Intervals)
    {
        //sort the 2d array
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));

        for(int i=0;i<=Intervals.length-2;i++)
        {
            int[] prevInterval=Intervals[i];
            if(prevInterval[1]>Intervals[i+1][0])
            {
                System.out.println(prevInterval[1]+"---"+Intervals[i+1][0]);
                return false;

            }


        }
        return true;
    }
}
