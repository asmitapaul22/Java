package Recursion;

import java.util.Scanner;

//to acheive permutation with the help of combination
public class Permutation_with_Combination {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int boxes=scn.nextInt();
        int items=scn.nextInt();

        permutationWithcombination(0,new int[items],boxes,0,"");

    }
    public static void permutationWithcombination(int currentBox,int[] items,int totalBoxes,int selctedBoxes,String ans)
    {
        for(int i=0;i<totalBoxes;i++)
        {
            permutationWithcombination(currentBox,items,totalBoxes,selctedBoxes,ans);
//            permutationWithcombination();
        }
    }
}
