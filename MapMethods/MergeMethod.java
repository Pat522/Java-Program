package MapMethods;

import java.util.HashMap;
import java.util.Map;

public class MergeMethod {
public static void main(String[] args) {
    
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Rahul");
        map.put(3,"Sunil");

        map.merge(1, " Singh ", (oldVal, newVal) -> oldVal + newVal);
        map.merge(2, "Aman", (oldVal, newVal) -> oldVal + newVal);
        map.merge(3, " Sunil", (oldVal, newVal) -> null);

        System.out.println(map);

     } 
}
