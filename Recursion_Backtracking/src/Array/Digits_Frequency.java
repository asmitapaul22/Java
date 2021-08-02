package Array;

import java.util.Scanner;

public class Digits_Frequency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int d=scanner.nextInt();
        int ans=digit_frequency(n,d);
        System.out.println(ans);

    }
    public static int digit_frequency(int n,int d)
    {
        int counter=0;
        while (n>0)
        {
            int lastDigit=n%10;

            if(lastDigit==d)
            {
                counter++;
            }
            n=n/10;
        }
        return counter;

    }
    }


