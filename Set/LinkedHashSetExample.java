package Set;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
    
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);    
        set.add(5);
        set.add(20);
        set.add(10); // duplicate, will not be added  
        set.add(null); // LinkedHashSet allows one null value
        set.add(null); // duplicate null, will not be added
        
        System.out.println(set); // Output will be in insertion order, e.g., [10, 5, 20, null]
    }
}