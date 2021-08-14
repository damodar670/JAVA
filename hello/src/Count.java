import java.io.*;
import java.util.*;
public class Count {
    public static void main(String args[]){
        HashMap<Character,Integer>hm=new HashMap<Character, Integer>();
        String str="aaaaabbbbbccccddddaaaawwwwxxxyyxyxix";
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),0);
        }
       // System.out.println(hm);
        int count=0;


            for (int i = 0; i < str.length(); i++) {
                char a=str.charAt(i);
                if(hm.containsKey(a)) {
                    hm.put(a, hm.get(a)+1);
                }
            }
        System.out.println(hm);
            String st1="";
        for (Map.Entry<Character,Integer> entry : hm.entrySet())
            {
                st1+=entry.getKey();
                st1+=entry.getValue();
            }
            System.out.println(st1);

        int max=Collections.max(hm.values());
        System.out.println(max);

    }

}



