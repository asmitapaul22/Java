package Arrays_and_Strings_Level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Best_Meeting_Point {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m= scn.nextInt();
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j]=scn.nextInt();
            }
        }
        int ans=bestMeetingPoint(grid);
        System.out.println(ans);
    }
    public static int bestMeetingPoint(int[][] grid)
    {
        //1. Get x coordinates-> row wise travel
        ArrayList<Integer> xcord=new ArrayList<>();
        for(int r=0;r< grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                if(grid[r][c]==1)
                    xcord.add(r);
            }
        }
        //2. Get y coordinates-> column wise travel
        ArrayList<Integer> ycord=new ArrayList<>();

        for(int c=0;c<grid[0].length;c++)
        {
            for(int r=0;r< grid.length;r++)
            {
                if(grid[r][c]==1)
                    ycord.add(c);
            }
        }
        //3. Calculate median->best meeting point
        int x=xcord.get(xcord.size()/2);//median of x
        int y=ycord.get(ycord.size()/2);//median of y
        System.out.println("median="+"("+x+","+y+")");
        //4. Calculate distance->min distance(because of median)
        int distance=0;
        for(int xval : xcord)
            distance+=Math.abs(x-xval);
        for(int yval : ycord)
            distance+=Math.abs(y-yval);
        //5. return distance
        return distance;
    }
}
