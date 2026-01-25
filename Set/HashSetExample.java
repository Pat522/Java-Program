package Set;

import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
    
        Set<Integer> set = new java.util.HashSet<>();
        set.add(10);    
        set.add(5);
        set.add(20);
        set.add(10); // duplicate, will not be added  
        set.add(null); // HashSet allows one null value
        set.add(null); // duplicate null, will not be added
        
        System.out.println(set); // Output may be in any order, e.g., [null, 20, 5, 10]

    }
}
