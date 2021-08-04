package Array;

import java.util.Scanner;

public class Decimal_to_any_Base {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int base=scanner.nextInt();
        int ans=decimalToAnyBase(num,base);
        System.out.print(ans);
    }
    public static int decimalToAnyBase(int num,int base)
    {
        int ans=0;
        int i=1;
        while(num>0)
        {
            int remainder=num%base;
            num=num/base;
            ans=ans+remainder*i;
            i=i*10;

        }
        return ans;
    }
}
