import java.io.*;
import java.util.*;
public class Activity {
	public int s,f;
	Activity(int i,int j){
		s=i;
		f=j;
	}
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 ArrayList<Activity>ar=new ArrayList<>();
	 ar.add(new Activity(1,4));
	 ar.add(new Activity(3,5));
	 ar.add(new Activity(0,5));
	 ar.add(new Activity(5,7));
	 ar.add(new Activity(3,9));
	 ar.add(new Activity(5,9));
	 ar.add(new Activity(6,10));
	 ar.add(new Activity(8,11));
	 ar.add(new Activity(8,12));
	 ar.add(new Activity(2,14));
	 ar.add(new Activity(12,16));
	Collections.sort(ar, new Sorting1());
	ArrayList<Integer>a=new ArrayList<>();
	int i=0,k=0;
	a.add(k);
	for(int j=1;j<ar.size();j++) {
		if(ar.get(j).s>=ar.get(k).f) {
			a.add(j);
			k=j;
		}
	}
	
for(int m=0;m<a.size();m++) {
	System.out.println("the Activities are "+((a.get(m))+1));
}
 }
}
class Sorting1 implements Comparator<Activity>
{
	public int compare(Activity o1, Activity o2) {
		return o1.f-o2.f;
	}
	
}
