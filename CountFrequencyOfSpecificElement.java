import java.util.*;

public class CountFrequencyOfSpecificElement {
    public static void main(String[] args) {
        List<String> months = List.of("Jan", "Feb", "Mar", "Jan", "Feb", "Apr", "Feb");

        // Count occurrences of all months
        Map<String, Integer> frequency = new HashMap<>();
        for (String month : months) {
            if (frequency.containsKey(month)) {
                frequency.put(month, frequency.get(month) + 1);
            } else {
                frequency.put(month, 1);
            }
        }

        // Count for a specific month
        String specificMonth = "Feb";
        int count = frequency.getOrDefault(specificMonth, 0);

        System.out.println(specificMonth+"="+count );

        //Using Stram Api
         String specificMonth1 = "Feb";

        long count1 = months.stream()
                           .filter(month -> month.equals(specificMonth1))
                           .count();

        System.out.println(count1);
    }
}
