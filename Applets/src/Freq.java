

// sort strings based on frequency
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Freq{
    public static void main(String[] args) {
    	String s="When your program has stopped, the first thing you need to know is where it stopped and how it got there. Each time your program performs a function call, information about the call is generated. That information includes the location of the call in your program, the arguments of the call, and the local variables of the function being called. The information is saved in a block of data called a stack frame. The stack frames are allocated in a region of memory called the call stack. When your program stops, the GDB commands for examining the stack allow you to see all of this information.";
        String[] ar = s.split(" "); 

        Map<String,Integer> strings = new HashMap<>();

        for(String string : ar) {
            if(strings.containsKey(string)) {
                Integer  count = strings.get(string);
                strings.put(string, ++count);
            } else {
                strings.put(string,1);
            }
        }

        final class FrequencyComparator implements Comparator<String> {
            Map<String,Integer> refMap;
            public FrequencyComparator(Map<String,Integer> base) {
                this.refMap = base;
            }

            @Override
            public int compare(String k1, String k2) {
                Integer val1 = refMap.get(k1);
                Integer val2 = refMap.get(k2);

                int num = val2.compareTo(val1)  ;
                // if frequencies are same then compare string itself
                return  num == 0 ? k1.compareTo(k2)   : num;
            }
        }

        FrequencyComparator comp = new FrequencyComparator(strings);
        TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(comp);
        sortedMap.putAll(strings);
        for(String i : sortedMap.keySet()) {
            int frequency = sortedMap.get(i);
                System.out.println(i + " : " + frequency);
        }
    }
}

