package MapMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComputeMethod {
    public static void main(String[] args) 
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ram",5);
        map.put("Ravi",3);

        //if val is not null add 1 in the 
        // existing value else val is null add 10 as new value
        map.compute("Ram", (k, v) -> (v != null) ? v+10 : 1);

        // Set "Amit" to 2 if it does not exist
        map.compute("Amit", (k, v) -> 10);

        // Subtract 3 from "Three"
        map.compute("Ravi", (k, v) -> v - 3);

        // Remove "Three" if value is 0 or less
        map.compute("Ravi", (k, v) -> null );

        System.out.println(map); 

        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("Ram",5);
        map1.put("Shyam",2);
        map1.put("Ravi",3);

        //if key is present add 20 to existing value
        map1.computeIfPresent("Ram", (key, val) -> val + 20); 
        System.out.println("ComputeIfPresent: " + map1);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Ram",5);
        map2.put("Shyam",2);
        map2.put("Ravi",3);
        
        // if "Lakshman" is not present in existing map add laxman with value 4
        map2.computeIfAbsent("laxman", key -> 4);
        System.out.println("ComputeIfAbsent: " + map2);
}  
}
