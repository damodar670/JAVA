import java.io.*;
import java.util.*;
public class Knapsack {
	public int p,w;
public Knapsack(int i, int j) {
		p=i;
		w=j;
	}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	 ArrayList<Knapsack> ar = new ArrayList<Knapsack>(); 
     ar.add(new Knapsack(25, 18)); 
     ar.add(new Knapsack(24, 15)); 
     ar.add(new Knapsack(15, 10)); 
     System.out.println("enter the Capacity");
     int capacity=sc.nextInt();
     Double x[]=new Double[10];
     double p=0;
     //Collections.reverseOrder((ar, new Sorting());
    // Collections.sort(ar, Collections.reverseOrder());
     Comparator c = Collections.reverseOrder(new Sorting()); 
     Collections.sort(ar, c); 
	//for( Knapsack a: ar) System.out.println(a.p); 
     for(int i=0;i<ar.size();i++) {
    	 if(ar.get(i).w<=capacity) {
    		 x[i]=(double) 1;
    		capacity=capacity-ar.get(i).w;
    		//System.out.println(capacity);
    		p=p+ar.get(i).p*x[i];
    	//	System.out.println(p);
    	 }
    	 else {
    		 x[i]=(double)capacity/ar.get(i).w;
    		// System.out.println(x[i]);
    		 //capacity=capacity-ar.get(i).w;
    		 // System.out.println((double)ar.get(i).p*x[i]);
    		 p=p+(double)ar.get(i).p*x[i];
    		// System.out.println(p);
    		 break;
    	 }
     }
     System.out.println("Profit is"+p);
}
}
 class Sorting implements Comparator<Knapsack>{

	public int compare(Knapsack o1, Knapsack o2) {
		
		/*float change1 = o1.p/o1.w;
		float change2 = o2.p/o2.w;
		if (change1 < change2) return 1;
		if (change1 > change2) return -1;
		return 0;
    */   Double a= ((double)o1.p/o1.w);
         Double b=(double)o2.p/o2.w;
		return Double.compare(a,b);
		//return o1.p/o1.w-o2.p/o2.w;	
		}
	
}
