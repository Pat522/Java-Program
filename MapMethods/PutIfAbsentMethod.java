package MapMethods;

import java.util.Map;
import java.util.TreeMap;

public class PutIfAbsentMethod {
    public static void main(String[] args) 
    {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Ram",5);
        map.put("Shyam",2);
        map.put("Ravi",3);

        map.putIfAbsent("Laxhman",7); 
        // adds the entry only if "Laxhman" is not already present
        System.out.println("PutIfAbsent: " + map);
    }
    
}
