package Array;

import java.util.Scanner;

public class Any_Base_To_Any_Base {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int base1=scanner.nextInt();
        int base2=scanner.nextInt();
        int ans=anyBaseToAnyBase(num,base1,base2);
        System.out.print(ans);
    }
    public static int anyBaseToAnyBase(int num,int base1,int base2)
    {
        int ans1=anyBaseToDecimal(num,base1);
        int finalAns=decimalToAnyBase(ans1,base2);
        return finalAns;
    }
    public static int anyBaseToDecimal(int num,int base)
    {
        int sum=0;
        int i=1;
        while (num>0)
        {
            int remainder=num%10;
            num=num/10;
            sum=sum+remainder*i;
            i=i*base;
        }
        return sum;

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
