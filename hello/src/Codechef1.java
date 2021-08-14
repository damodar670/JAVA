/* package codechef; // don't place package name! */

import java.util.*;
import java.math.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<list.size();i++){
            double a=0;
            int count=0;
            a=list.get(i);
            double  m=1;
          //count=count+Math.floor(a/Math.pow(a,m));
            //Math.floor(a/Math.pow(a,m);
          while(Math.floor(a/Math.pow(5,m))!=0){
              count=count+(int)Math.floor(a/Math.pow(5,m));
             // System.out.println(Math.pow(5,m));
              m++;
          }
          System.out.println(count);
        }
    }
}
