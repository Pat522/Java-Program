import java.util.*;

public class SpecificMonthCount {
    public static void main(String[] args) {
        List<String> months = List.of("Jan", "Feb", "Mar", "Jan", "Feb", "Apr", "Feb");

        // Count occurrences of all months
        Map<String, Integer> countMap = new HashMap<>();
        for (String month : months) {
            countMap.put(month, countMap.getOrDefault(month, 0) + 1);
        }

        // Count for a specific month
        String specificMonth = "Feb";
        int count = countMap.getOrDefault(specificMonth, 0);

        System.out.println(count );

        //Using Stram Api
         String specificMonth1 = "Feb";

        long count1 = months.stream()
                           .filter(month -> month.equals(specificMonth1))
                           .count();

        System.out.println(count1);
    }
}
