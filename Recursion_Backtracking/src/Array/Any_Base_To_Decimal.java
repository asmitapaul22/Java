package Array;

import java.util.Scanner;

public class Any_Base_To_Decimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int base=scanner.nextInt();
        int ans=anyBaseToDecimal(num,base);
        System.out.print(ans);
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
}
