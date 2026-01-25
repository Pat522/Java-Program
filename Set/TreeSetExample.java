package Set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
     public static void main(String[] args) {
    
        Set<Integer> set = new TreeSet<>();
        set.add(10);    
        set.add(5);
        set.add(20);
        set.add(10); // duplicate, will not be added  
      //set.add(null); // Tree does not allow null values
        
        System.out.println(set); // Output will be in sorted order, e.g., [5, 10, 20]}
     }
}
