package Arrays_and_Strings_Level2;

import java.util.Scanner;

public class Long_Pressed_Name_Leetcode925 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String name=scn.next();
        String typed=scn.next();
        boolean response=isPosiible(name,typed);
        System.out.println(response);
    }
    public static boolean isPosiible(String name,String typed)
    {
        if(name.length()>typed.length())
            return false;
        int i=0;
        int j=0;
        while(i<name.length()&&j<typed.length())
        {
            if(name.charAt(i)==typed.charAt(j))
            {
                i++;
                j++;
            }else if(i>0&&name.charAt(i-1)==typed.charAt(j))
            {
                j++;
            }else{
                return false;
            }
        }
        while(j<typed.length())
        {
            if(name.charAt(i-1)==typed.charAt(j)) j++;
            else return false;
        }

        return i<name.length()?false:true;
    }

}
