package Recursion;

import java.util.Scanner;

public class Print_Permutation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printPermutation(str,"");
    }
    public static void printPermutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String roq=left+right;
            printPermutation(roq,ans+ch);

        }


    }
}
