import java.util.*;
import java.io.*;
public class Fib {
 public static void main(String args[]) {
	 System.out.println("enter a number");
	 Scanner sc=new Scanner(System.in);
	 long n=sc.nextLong();
	 long pretime=System.nanoTime();
	 System.out.println("The "+n+" th fibonacci number is   "+Fib(n));
	 long postTime=System.nanoTime();
	 System.out.println("Execution time="+(postTime-pretime));
 }

private static long Fib(long n) {
	if(n==1||n==0) {
		 return 1;
	}
	else {
	return Fib(n-1)+Fib(n-2);
	}
}
}
