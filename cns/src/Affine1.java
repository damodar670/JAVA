import java.util.*;
import java.io.*;
public class Affine1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String msg="sq";
        String cipher="ae";
        int p1=((int)msg.charAt(0)-97)%26;
        int p2=((int)msg.charAt(1)-97)%26;
        int c1=((int)cipher.charAt(0)-97)%26;
        int c2=((int)cipher.charAt(1)-97)%26;
        double a,b;
      //  p1*a+b=c1;
      //  p2*a+b=c2;
        int p,c;

           p=p1-p2;
           c=c1-c2;
         System.out.println(p1+" "+c1+" "+p2+" "+c2);
          a=(double)c/p;
        System.out.println(a);
         b=c1-p1*a;
        // System.out.println(b);
         while(a<0){
             a=a+26;
         }
         if(a>26) a=a%26;
         if(b>26){
             b=b%26;
         }
         while(b<0) b=b-26;
       System.out.println("key is "+(int)a+" ,"+(int)b);
         int f=inverse((int)a);
         System.out.println(f);
         System.out.println(p1+" "+(((c1-(int)b))*f)%26);
    }
    static int inverse(int a){
        a = a % 26;
        for (int x = 1; x < 26; x++)
            if ((a * x) % 26 == 1)
                return x;
        return 1;

    }

}
