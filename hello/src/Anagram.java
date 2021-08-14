import java.util.*;
public class Anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int flag=0;
        if(a.length()!=b.length()){
            System.out.println("Not Anagrams");
            flag=1;
        }
        if(flag==0){
            for(int i=0;i<a.length();i++){
                 char c=b.charAt(i);
                 int k=a.indexOf(c);
                if(k!=-1){

                }
                else {
                    System.out.println("Not anagrams");
                    break;
                }
            }
            System.out.println("Anagrams");
        }

    }
}
