package SortingTreeMapByValue;
import java.util.*;

public class UsingStreamApi {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        map.put("Ram",6);
        map.put("Shyam",2);
        map.put("Ravi",3);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

    }
}