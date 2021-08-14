import java.io.*;
import java.util.*;
public class Basic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int result=countT(arr);
        System.out.println(result);
    }
    static int countT(int arr[]){
        if(arr.length<3){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-2;i++) {
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count++;
                    }
                }
        }

        }
        return count;

    }


 }
