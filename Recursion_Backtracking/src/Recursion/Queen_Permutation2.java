package Recursion;

import java.util.Scanner;

public class Queen_Permutation2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean[] queens=new boolean[n];
        permutation2Queen(0,0,0,n,"",queens);
    }
    public static void permutation2Queen(int row,int col,int qpsf,int tq,String asf,boolean[] queens)
    {
       if(row==tq)
       {
           if(qpsf==tq)
           {
               System.out.println(asf);
               System.out.println();

           }
           return;
       }
        int nr=0,nc=0;
        String sepeartor="";
        if(col==tq-1)
        {
            nr=row+1;
            nc=0;
            sepeartor="\n";
        }else{
            nr=row;
            nc=col+1;
            sepeartor="\t";
        }
      for (int i=0;i<queens.length;i++)
      {
          if(queens[i]==false)
          {
              queens[i]=true;
              permutation2Queen(nr,nc,qpsf+1,tq,asf+"Q"+(i+1)+sepeartor,queens);
                queens[i]=false;
          }
      }
        permutation2Queen(nr,nc,qpsf+0,tq,asf+"-"+sepeartor,queens);
    }
}
