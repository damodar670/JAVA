/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        double Amount = sc.nextDouble();
        if(W%5==0&&(Amount-W)>0){
            System.out.printf("%.2f\n",Amount-W-0.5 );
        }
        else if (W % 5 != 0) {
            System.out.printf("%.2f\n",Amount );
        }
        else if(W>Amount){
            //System.out.println(Amount);
            System.out.printf("%.2f\n",Amount );
        }



    }
}


