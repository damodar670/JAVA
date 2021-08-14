import java.util.*;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args)
    {

        ArrayList<Integer> list=new ArrayList<Integer>();
        int n;
        Scanner s=new Scanner(System.in);
        while(true){
            n=s.nextInt();
            if(n==42){
                break;
            }
            else list.add(n);
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }
}