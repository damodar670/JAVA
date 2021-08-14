/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef13 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(sc.next());
            }
            char t[] = {'R', 'G'};
            String ss;
            int cost = 0, cost1 = 0;
            for (int j = 0; j < m; j++) {
                ss = list.get(j);
                int in=0;
                for (int k = 0; k < n-1; k = k=k+2) {
                    if (ss.charAt(k) == t[in]) {
                        in=(in+1)%2;
                        if(ss.charAt(k+1)==t[in]) {
                          cost=cost+0;
                        }
                        else cost=cost+5;
                    }
                    if (ss.charAt(k) == t[in]) {
                        if(ss.charAt(k+1)==t[0]) {
                            cost=cost+0;
                        }
                        else cost=cost+3;
                    }
                }

            }
            System.out.println(cost);
        }
    }
}


