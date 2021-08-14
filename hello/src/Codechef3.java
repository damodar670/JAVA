/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef3
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            //if(a==0) System.out.println(1);
            long fact=1;
            for(int j=1;j<=a;j++){
                fact=fact*j;
            }
            System.out.println(fact);
        }

    }
}
