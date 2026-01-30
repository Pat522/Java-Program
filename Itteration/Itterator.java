package Itteration;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class Itterator  {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> itr = list.iterator();
        
        //Forward direction(ascending order)
        while (itr.hasNext()) {
            String s = itr.next();
           // System.out.println(s);
            if (s.equals("B")) 
                itr.remove(); // allowed
            
        }
        System.out.println(list);
    }
}
