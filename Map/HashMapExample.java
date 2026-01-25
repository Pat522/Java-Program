package Map;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample 
{
    public static void main(String[] args) 
    {
    Map<Integer,String> map=new HashMap<>();
    map.put(4,"Apple");
    map.put(4,"Apple"); // duplicate key not allowed,
    map.put(2,"Banana");
    map.put(3,"Cherry");
    map.put(null,"Date"); //only one null key allowed
    map.put(null,"Elderberry"); // duplicate null key not allowed,
    map.put(6,null); //multiple null values allowed
    map.put(7,null); //multiple null values allowed
  

    System.out.println(map);  //Output may be in any order due to HashMap's nature 
    }
}
