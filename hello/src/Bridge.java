import java.io.*;
import java.util.*;
public class Bridge {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int cost=0;
        int i=0,temp;
        while(i<3){
            if(a[i]<a[i+1]){
                cost=cost+a[i+1];
                temp=a[i];a[i]=a[i+1];a[i+1]=temp; cost=cost+a[i+1];
            }
           // else { cost=cost+a[i]+a[i+1];  }
            i=i+1;
        }
        //to bring last person we can subtract one from cost
        System.out.println(cost-1);
    }

}
