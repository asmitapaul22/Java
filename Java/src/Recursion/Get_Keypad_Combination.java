package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Keypad_Combination {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str=scan.next();
        ArrayList<String> words=getKPC(str);
        System.out.println(words);
    }
    static String[] codes={",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str)
    {
        //678
        if(str.length()==0)
        {
            ArrayList<String> baseresult=new ArrayList<>();
            baseresult.add("");
            return baseresult;
        }
        char ch=str.charAt(0);//6
        String ros=str.substring(1);//78
        ArrayList<String> combinations=getKPC(ros);//6 words from 78
        ArrayList<String> finalCombination=new ArrayList<>();//24 words from 678
        String codeforch=codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++)
        {
            char chcode=codeforch.charAt(i);
            for(String combination:combinations)
                finalCombination.add(chcode+combination);
        }

        return finalCombination;
      }
}
