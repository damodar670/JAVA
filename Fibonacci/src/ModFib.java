import java.io.*;
import java.util.*;
public class ModFib {
	public static long fib[]=new long[10000];
	
public static void main(String args[]) {
	//System.out.println(fib[76]);
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter a number");
	 long n=sc.nextLong();
	 long pretime=System.nanoTime();
	 System.out.println("The "+n+" th fibonacci number is   "+Fib(n));
	 long postTime=System.nanoTime();
	 System.out.println("Execution time="+(postTime-pretime));
}
  private static long Fib(long n) {
	 long fibvalue=0;
	 if(n==0)
		 return 0;
	 else if(n==1)
		  return 1;
	 else if(fib[(int)n]!=0) {
		 return fib[(int)n];
	 }
	 else {
		 fibvalue=Fib(n-1)+Fib(n-2);
		 fib[(int)n]=fibvalue;
	 }
	return fibvalue;
 }
}
