package Recursion;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int boxes=scn.nextInt();
        int totalItems=scn.nextInt();
permutation(new int[boxes],1,totalItems);
    }
    public static void permutation(int[] boxes,int currentItem,int totalItems )
    {
        for(int i=0;i<boxes.length;i++)
            System.out.println(boxes[i]);
//        if(currentItem>totalItems)
//        {
//            for (int i=0;i<boxes.length;i++)
//            {
//                System.out.print(boxes[i]);
//            }
//            System.out.println();
//            return;
//        }
//        for(int i=0;i<boxes.length;i++)
//        {
//           if(boxes[i]==0)
//           {
//               boxes[i]=currentItem;
//               permutation(boxes,currentItem+1,totalItems);
//               boxes[i]=0;
//           }
//        }

    }
}
