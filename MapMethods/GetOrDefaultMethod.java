package MapMethods;

import java.util.HashMap;
import java.util.Map;


public class GetOrDefaultMethod {
    public static void main(String[] args) 
    {

        Map<String, Integer> map = new HashMap<>();
        map.put("Ram",5);
        map.put("Shyam",2);
        map.put("Ravi",3);

        // if key present returns 3
        System.out.println("GetOrDefault: " + map.getOrDefault("Ravi",0)); 
         // if key present returns 3
        System.out.println("GetOrDefault: " + map.getOrDefault("Ravi",3)); 
        //if key is not present returns 0 as default value
        System.out.println("GetOrDefault: " + map.getOrDefault("Lakshman", 0)); 
    
}
}
