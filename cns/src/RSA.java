import java.io.*;
import java.util.*;
import java.lang.Math;
public class RSA {

}
   /* public static void main(String args[])
    {
        System.out.println("Generating public key and private keys");
        System.out.println("Enter p and q");
        Scanner sc=new Scanner(System.in);
        double p=sc.nextInt();
        double q=sc.nextInt();
        double n=p*q;
        double phin=eulerP(p,q);
        double range=phin-1;
        double publickeye=11;
        //(int)(Math.random() * range) + 1;
        int publickeyd=moduloInverse(publickeye,phin);
        System.out.println(publickeyd);
        System.out.println("Enter a message to encrypt");
        String plain=sc.next();
        String encrypt=encryptM(plain,publickeye,n);
        String decrypt=decryptM(encrypt,publickeyd,n);
        System.out.println("Encrypted message :"+encrypt);
        System.out.println("Decrypted message :"+decrypt);

    }
    public static String encryptM(String m,double e,double n){
        String dec="";
        for(int i=0;i<m.length();i++){
            int m1=(int)m.charAt(i);
           // System.out.println(m1);
            dec=dec+moduloArithmetic(m1,e,n);

        }
        return dec;
    }
    public static String decryptM(String m,double d,double n)
    {
        String dec="";
        for(int i=0;i<m.length();i++){
            int m1=(int)m.charAt(i);
            dec=dec+moduloArithmetic(m1,d,n);
        }
        return dec;
    }

    public static char moduloArithmetic(double m,double e,double n){
        double c=Math.pow(m,e);
        int c1=(int)c;
        System.out.println(c1);
        System.out.println((c1%n));
        char d;
        int cc=((c1%n)%256);
        System.out.println((char)cc);
        return (char)cc;
    }


    public static double eulerP(double p,double q){
        double count=(p-1)*(q-1);
        return count;
    }
    public static int moduloInverse(int a,int m){
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return 1;
    }


} */
