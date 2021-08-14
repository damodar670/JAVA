import java.io.*;
import java.util.*;
public class Coin_change {
 public static void main(String args[])
 { 
	 Scanner sc=new Scanner(System.in);
	 int x;
	 int[] a=new int[10];
	 int b[]=new int[10];
	 //Taking inputs 
	 System.out.println("Enter the Denominations");
	 for(int i=1;i<8;i++) {
		
		 x=sc.nextInt();
		 a[i]=x;
		 }
	 
	 System.out.println("Enter the change ");
	 int change=sc.nextInt();
	 //Main logic to find the denominations
	 for(int i=1;i<8;i++) {
		 if(change>=a[i]) {
			 b[i]=change/a[i];
			 change=change-b[i]*a[i];
		 }
		 if(change==0) break;
	 }
	 //displaying the output
	 for(int i=0;i<8;i++) {
		System.out.println("Denominations are "+b[i]+" Moneyis "+a[i]);
	 }
	
 }
}
