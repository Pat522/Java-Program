package Itteration;

import java.util.*;

public class ListItterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> litr = list.listIterator();

        // Forward direction (Ascending order)
        while (litr.hasNext()) {
            String s = litr.next();

            // Update element
            if (s.equals("B")) 
                litr.set("B-Updated");   // update B
            

            // Add element
            if (s.equals("C")) 
                litr.add("D");           // add after C
            
             // Remove element
            if (s.equals("A")) 
                litr.remove();           // remove A
            
        }

        System.out.println("After add & update: " + list);

        // Backward direction (Descending order)
        while (litr.hasPrevious()) {
            String s = litr.previous();
            System.out.println(s);
        }
    }
}
