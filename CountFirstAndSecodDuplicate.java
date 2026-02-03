import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFirstAndSecodDuplicate {
     public static void main(String[] args) {
       List<String> months = List.of("Jan", "Feb", "Mar", "Jan", "Feb", "Apr", "Feb");

        Map<String, Integer> countMap = new HashMap<>();
        for (String month : months) {
            countMap.put(month, countMap.getOrDefault(month, 0) + 1);
        }
       
        int duplicateCount = 0;

         for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
             duplicateCount ++;
                if (duplicateCount == 1) {
                    System.out.println("First duplicate: " + entry.getKey());
                } else if (duplicateCount == 2) {
                    System.out.println("Second duplicate: " + entry.getKey());
                    break;
                }
            }
        }
    }
  
}
