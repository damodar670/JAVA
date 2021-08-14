import java.io.*;
import java.util.*;
public class Codechef7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int mark=sc.nextInt();
        int query=sc.nextInt();
        int arr[]=new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        while(count<query){
            int i=sc.nextInt();
            int j=sc.nextInt();
            int flag=0,flag1=0;
            if(mark<60){
                System.out.println("Sad");
                flag=1;
            }
            if(flag==0) {
                for (int m = i; m <= j; m++) {
                   if(arr[m]>mark){
                    flag1=1;
                    break;
                   }
                }
                if(flag1==0){
                    System.out.println("Happy");
                }
                else   {System.out.println("Sad"); }
            }
            count++;
        }
    }

}
