import java.io.*;
import java.util.*;
public class Playfair {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String key="monarchy";
        String plain="instruments";
        char a[][]=new char[5][5];
        if(plain.length()%2!=0) {
            plain=plain+"z";
        }
        int count=0;
        ArrayList<Character>arr=new ArrayList<>();

        for(int i=0;i<key.length();i++) {
            arr.add(key.charAt(i));
        }
        System.out.println(arr);
        char c1='a';
        /*	for(int i=0;i<25-plain.length();i++) {
        		if(arr.contains(c1)) {
        			 c1=(char) ((int)c1+1);
        		}
        		else { arr.add(c1);  c1=(char) ((int)c1+1);  }
        	} */
        // char c1='a';
        System.out.println("Table IS:");
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(count<key.length()) {
                    a[i][j]=key.charAt(count);
                    count++;
                }
                else {

                    while(true) {
                        if(arr.contains((c1))) {
                            c1=(char) ((int)c1+1);

                        }
                        else {

                            a[i][j]=c1;
                            if(a[i][j]=='j') {
                                a[i][j]='k';
                                c1=(char) ((int)c1+1);
                            }
                            c1=(char) ((int)c1+1);


                            break;
                        }

                    }
                }

            }
        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {

                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        String cipher=encrypt(plain,key,a);
        System.out.println("After Encryption ="+cipher);
        String plain1=decrypt(cipher,key,a);
        System.out.println("After Decrption="+plain1.substring(0,plain1.length()-1));
    }

    private static String decrypt(String plain, String key, char[][] a) {
        String result="";
        ArrayList<String>arr=new ArrayList<>();

        for(int i=0;i<plain.length();i=i+2) {
            String temp=Character.toString(plain.charAt(i));
            temp=temp+Character.toString(plain.charAt(i+1));
            arr.add(temp);

        }
        for(int i=0;i<arr.size();i++) {
            result=result+search(arr.get(i),a);
        }
        return result;

    }

    private static String encrypt(String plain, String key, char[][] a) {
        String result="";
        ArrayList<String>arr=new ArrayList<>();

        for(int i=0;i<plain.length();i=i+2) {
            String temp=Character.toString(plain.charAt(i));
            temp=temp+Character.toString(plain.charAt(i+1));
            arr.add(temp);

        }
        for(int i=0;i<arr.size();i++) {
            result=result+search1(arr.get(i),a);
        }
        return result;



    }

    private static String search1(String string, char[][] a) {
        String result="";
        if(string.charAt(0)=='j') {
            result+="i";
        }
        if(string.charAt(1)=='j') {
            result+="i";
        }
        int arr[]=new int[4];
        int i,j;
        for( i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                if(string.charAt(0)==a[i][j]) {
                    arr[0]=i;
                    arr[1]=j;
                }
                if(string.charAt(1)==a[i][j]) {
                    arr[2]=i;
                    arr[3]=j;
                }

            }
        }
        if(a[1]==a[3]) {
            result=result+Character.toString(a[--arr[0]%5][arr[1]]);
            result=result+Character.toString(a[--arr[2]%5][arr[3]]);
        }
        if(a[0]==a[2]) {
            result=result+Character.toString(a[arr[0]][--arr[1]%5]);
            result=result+Character.toString(a[arr[2]][--arr[3]%5]);
        }

        else {
            result=result+Character.toString(a[arr[0]][arr[3]]);
            result=result+Character.toString(a[arr[2]][arr[1]]);
        }
        return result;

    }

    private static String search(String string, char[][] a) {
        String result="";
        if(string.charAt(0)=='j') {
            result+="i";
        }
        if(string.charAt(1)=='j') {
            result+="i";
        }
        int arr[]=new int[4];
        int i,j;
        for( i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                if(string.charAt(0)==a[i][j]) {
                    arr[0]=i;
                    arr[1]=j;
                }
                if(string.charAt(1)==a[i][j]) {
                    arr[2]=i;
                    arr[3]=j;
                }

            }
        }
        if(a[1]==a[3]) {
            result=result+Character.toString(a[++arr[0]%5][arr[1]]);
            result=result+Character.toString(a[++arr[2]%5][arr[3]]);
        }
        if(a[0]==a[2]) {
            result=result+Character.toString(a[arr[0]][++arr[1]%5]);
            result=result+Character.toString(a[arr[2]][++arr[3]%5]);
        }

        else {
            result=result+Character.toString(a[arr[0]][arr[3]]);
            result=result+Character.toString(a[arr[2]][arr[1]]);
        }
        return result;
    }
}
