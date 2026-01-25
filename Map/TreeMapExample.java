package Map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) 
    {
    Map<Integer,String> map=new TreeMap<>();
    map.put(4,"Apple");
    map.put(4,"Apple"); // duplicate key not allowed,
    map.put(2,"Banana");
    map.put(3,"Cherry");
   // map.put(null,"Date"); //No null key allowed
    map.put(6,null); //multiple null values allowed
    map.put(7,null); //multiple null values allowed


    System.out.println(map);  //Output will be in sorted order of keys
    }
}
