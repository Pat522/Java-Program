package SortingTreeMapByValue;
import java.util.*;

public class UsingArrayList {
    public static void main(String[] args) {

TreeMap<String, Integer> map = new TreeMap<>();
 map.put("Ram",6);
 map.put("Shyam",2);
 map.put("Ravi",3);

List<Map.Entry<String, Integer>> list =
        new ArrayList<>(map.entrySet());

list.sort(Map.Entry.comparingByValue());

for (Map.Entry<String, Integer> entry : list) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
    }
 }
}   
