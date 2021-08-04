package Array;

import java.util.Scanner;

public class Any_Base_Addition {
    public static void main(String[] args) {
        //NOT COMPLETED
        Scanner scn=new Scanner(System.in);
        int base=scn.nextInt();
        int number1=scn.nextInt();
        int number2=scn.nextInt();
        int sum=addAnyBase(base,number1,number2);
        System.out.print(sum);

    }
    public static int addAnyBase(int base,int num1,int num2)
    {
        int totalsum=0;
        int sum=0;
        int i=1;
        while(num1>0&&num2>0)
        {
            System.out.println(num1+"---"+num2);
            int digit1=num1%10;
            int digit2=num2%10;
            if(digit1+digit2>=base)
            {
                sum=digit1+digit2-base;
                totalsum=totalsum+sum*i;
                i=i*10;
                num1=num1/10;
                num2=num2/10;
                num1++;
            }else{
                sum=digit1+digit2;
                totalsum=totalsum+sum*i;
                i=i*10;
            }
System.out.println(totalsum);
        }
        return totalsum;
    }
}
