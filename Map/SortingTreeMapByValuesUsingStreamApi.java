package Map;
import java.util.*;

public class SortingTreeMapByValuesUsingStreamApi {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Ram",6);
        map.put("Shyam",2);
        map.put("Ravi",3);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }
    
}