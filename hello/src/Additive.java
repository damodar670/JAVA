import java.io.*;
import java.util.*;
public class Additive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to Encrypt ");
        String s=sc.next();
        System.out.println("Enter a key ");
        int k=sc.nextInt();
        String s1;
        s1=encrypt(s,k);
        System.out.println("After Encryption "+s1);
        String s2=decrypt(s1,k);
        System.out.println("After Decryption "+s2);
    }
    static String decrypt(String s,int k){

        StringBuilder tem=new StringBuilder();
        String n=null;
        for(int i=0;i<s.length();i++){
            //int a=(int)s.charAt(i);

            if(Character.isUpperCase(s.charAt(i))){
                char c = (char)(((int)s.charAt(i) - k - 65) % 26 + 65);
                tem.append(c);
            }
            else {
                char c = (char)(((int)s.charAt(i) - k - 97) % 26 + 97);
                tem.append(c);
            }
            n=tem.toString();
        }

        return n ;
    }

    static String encrypt(String s,int k){
           StringBuilder tem=new StringBuilder();
           String n=null;
          for(int i=0;i<s.length();i++){
                //int a=(int)s.charAt(i);

                if(Character.isUpperCase(s.charAt(i))){
                    char c = (char)(((int)s.charAt(i) + k - 65) % 26 + 65);
                    tem.append(c);
                }
                else {
                    char c = (char)(((int)s.charAt(i) + k - 97) % 26 + 97);
                    tem.append(c);
                }
             n=tem.toString();
          }

        return n ;
    }


}
