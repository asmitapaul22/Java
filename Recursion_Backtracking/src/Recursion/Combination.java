package Recursion;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int boxes=scan.nextInt();
        int boxToChoose=scan.nextInt();

        combination(1,boxes,boxToChoose,0,"");
    }
    public static void combination(int boxIndex,int totalBoxes,int boxToChoose,int boxSelected,String ans)
    {
        if(boxIndex>totalBoxes)
        {
            if(boxSelected==boxToChoose)
                System.out.println(ans);
            return;
        }
        combination(boxIndex+1, totalBoxes, boxToChoose, boxSelected+1, ans+"i");
        combination(boxIndex+1, totalBoxes, boxToChoose, boxSelected, ans+"-");
    }
}
