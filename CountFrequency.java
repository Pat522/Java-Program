import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
       List<String> months = List.of("Jan", "Feb", "Mar", "Jan", "Feb", "Apr", "Feb");

        // Manual HashMap
        Map<String, Integer> frequency = new HashMap<>();
        for (String month : months) {
            if (frequency.containsKey(month)) {
                frequency.put(month, frequency.get(month) + 1);
            } else {
                frequency.put(month, 1);
            }
        }
        System.out.println(frequency);

        // Stream API
         Map<String, Long> frequencyMap = new HashMap<>();
         months.stream().forEach(month -> 
            frequencyMap.put(month, frequencyMap.getOrDefault(month, 0L) + 1));
        System.out.println(frequencyMap); 
    }
}