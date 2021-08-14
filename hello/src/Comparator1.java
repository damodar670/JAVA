import java.io.*;
import java.util.*;
public class Comparator1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        //System.out.println("");
        int array[]=new int[N];
        int rem=0,count=0,a=0;
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();

        for(int i=0;i<N;i++)
        {
            //System.out.println("hii");
            array[i]=sc.nextInt();
            a=array[i];
            while(a>0)
            {
                rem=a%10;
                a=a/10;
                System.out.println(rem);
                if(rem==9)
                {
                    count++;
                }
            }
            map.put(array[i],count);
            count=0;

        }
        System.out.println("hii");
        System.out.println(map);
        System.out.println("According to keys");
        TreeMap<Integer, Integer> sorted = new TreeMap<>(map);
        /* for (Map.Entry<Integer, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue()); */
        System.out.println(sorted);

}

}
