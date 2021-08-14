import java.util.*;
public class Balance {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 0;
        String a;
        for (i = 0; i < N; i++) {
         a=s.next();
         char c[]=new char[a.length()];
         for(int j=0;j<a.length();j++){
             c[j]=a.charAt(j);
         }
         int count=0,count1=0;
        int  j=0;
         while(j!=a.length()-1){
             if(c[j]=='('){
                 count++; count1++;
                 j++; break;
             }
             while(count!=0){
                 if(c[j]==')') count1++;
                 j++;
             }
         }

        }
    }
}
