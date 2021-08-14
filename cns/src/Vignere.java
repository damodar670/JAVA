import java.io.*;
import java.util.*;
public class Vignere {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char arr[][]=new char[26][26];
        char a='A';
        for(int i=0;i<26;i++){

            char b=a;
            for(int j=0;j<26;j++){
                 if((int)b>=91) {
                    b='A';
                 }
                arr[i][j]=b;
                b=(char)((int)b+1);
            }
            a=(char)((int)a+1);
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("Enter a message and key");
        String in=sc.next();
        String key=sc.next();
        String cipher="",plain1="";
        for(int i=0;i<in.length();i++){
            List<Integer>list=fun(in.charAt(i),key.charAt(i));
                //fun(in.charAt(i),key.charAt(i));
                   cipher = cipher + arr[list.get(0)][list.get(1)];
        }
        System.out.println(cipher);
        for(int i=0;i<cipher.length();i++){
            List<Integer>list=fun(key.charAt(i),cipher.charAt(i));
            int count=0;
            for(int j=0;j<26;j++) {
                // cipher = cipher + arr[list.get(0)][list.get(1)];
                if(arr[list.get(0)][j]==cipher.charAt(i)){
                    break;
                }
                count++;
            }
            plain1 = plain1 + arr[0][count];

        }
        System.out.println(plain1);
    }
    public static List<Integer> fun(char s,char y){
        List<Integer>list=new ArrayList<>();
        if(s=='A'){
            list.add(0);
        }
        if(s=='B'){
            list.add(1);
        }
        if(s=='C'){
            list.add(2);
        }
        if(s=='D'){
            list.add(3);
        }
        if(s=='E'){
            list.add(4);
        }
        if(s=='F'){
            list.add(5);
        }
        if(s=='G'){
            list.add(6);
        }
        if(s=='H'){
            list.add(7);
        }
        if(s=='I'){
            list.add(8);
        }
        if(s=='J'){
            list.add(9);
        }
        if(s=='K'){
            list.add(10);
        }
        if(s=='L'){
            list.add(11);
        }
        if(s=='M'){
            list.add(12);
        }
        if(s=='N'){
            list.add(13);
        }
        if(s=='O'){
            list.add(14);
        }
        if(s=='P'){
            list.add(15);
        }
        if(s=='Q'){
            list.add(16);
        }
        if(s=='R'){
            list.add(17);
        }
        if(s=='S'){
            list.add(18);
        }
        if(s=='T'){
            list.add(19);
        }
        if(s=='U'){
            list.add(20);
        }
        if(s=='V'){
            list.add(21);
        }
        if(s=='W'){
            list.add(22);
        }
        if(s=='X'){
            list.add(23);
        }
        if(s=='Y'){
            list.add(24);
        }
        if(s=='Z'){
            list.add(25);
        }
        if(y=='A'){
            list.add(0);
        }
        if(y=='B'){
            list.add(1);
        }
        if(y=='C'){
            list.add(2);
        }
        if(y=='D'){
            list.add(3);
        }
        if(y=='E'){
            list.add(4);
        }
        if(y=='F'){
            list.add(5);
        }
        if(y=='G'){
            list.add(6);
        }
        if(y=='H'){
            list.add(7);
        }
        if(y=='I'){
            list.add(8);
        }
        if(y=='J'){
            list.add(9);
        }
        if(y=='K'){
            list.add(10);
        }
        if(y=='L'){
            list.add(11);
        }
        if(y=='M'){
            list.add(12);
        }
        if(y=='N'){
            list.add(13);
        }
        if(y=='O'){
            list.add(14);
        }
        if(y=='P'){
            list.add(15);
        }
        if(y=='Q'){
            list.add(16);
        }
        if(y=='R'){
            list.add(17);
        }
        if(y=='S'){
            list.add(18);
        }
        if(y=='T'){
            list.add(19);
        }
        if(y=='U'){
            list.add(20);
        }
        if(y=='V'){
            list.add(21);
        }
        if(y=='W'){
            list.add(22);
        }
        if(y=='X'){
            list.add(23);
        }
        if(y=='Y'){
            list.add(24);
        }
        if(y=='Z'){
            list.add(25);
        }
       return list;
    }

}
