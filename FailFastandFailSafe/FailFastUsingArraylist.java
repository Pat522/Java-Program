package FailFastandFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastUsingArraylist {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> itr = list.iterator();
        
        //Forward direction(ascending order)
        while (itr.hasNext()) 
        {
        String s = itr.next();
      //  System.out.println(s);

       // list.remove("A"); // Structural modification is not allowed fail-fast throws ConcurrentModificationException 
       
       //Using itr.remove() we can access remove method
       if (s.equals("B")) 
       {
        itr.remove(); // allowed
       }
    }
        System.out.println(list);
    }
    
}
