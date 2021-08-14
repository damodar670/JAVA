import java.util.*;
public class Codechef4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double gsalary=0;
        for(int i=0;i<N;i++){
            int salary=sc.nextInt();
            if(salary<1500){
               gsalary=salary+0.1*salary+0.9*salary;
            }
            else gsalary=salary+500+0.98*salary;

            System.out.println(gsalary);
        }
    }

}
