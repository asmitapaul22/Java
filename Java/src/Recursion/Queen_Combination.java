package Recursion;

import java.util.Scanner;

public class Queen_Combination {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        queenCombination(0,n,0,0,"");
    }
    //qpsf--queen placed so far
    //tq--total queen
    //asf--answer so far
    public static void queenCombination(int qpsf,int tq,int row,int col,String asf)
    {
        if(row==tq)
        {
            if(qpsf==tq)
            {
                System.out.println(asf);
            }
            return;
        }
        // nr-- new row and nc-- is new column
        int nr=0;
        int nc=0;
        //yasf-- yes answer so far  and  nasf-- no aswer so far
        String yasf="";
        String nasf="";
       if(col==tq-1)
       {
           nr=row+1;
           nc=0;
           //because we will be going to the next row
           yasf=asf+"q\n";
           nasf=asf+"-\n";
       }
       else
       {
            nc=col+1;
            nr=row;
            yasf=asf+"q";
            nasf=asf+"-";
       }
        queenCombination(qpsf+1,tq,nr,nc,yasf);

        queenCombination(qpsf+0,tq,nr,nc,nasf);
    }
}
