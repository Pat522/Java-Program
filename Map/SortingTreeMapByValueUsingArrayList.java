package Map;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
    
public class SortingTreeMapByValueUsingArrayList {
    public static void main(String[] args) 
    {
     TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Ram",5);
        map.put("Shyam",2);
        map.put("Ravi",3);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : list) 
            System.out.println(entry.getKey() + " = " + entry.getValue());
    }   
    }
    

