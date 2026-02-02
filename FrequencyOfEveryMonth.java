import java.util.*;

public class FrequencyOfEveryMonth {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>(List.of(
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December",
            "January", "February", "March", "April", "May"
        ));

        // Manual HashMap
        Map<String, Integer> frequencyMap1 = new HashMap<>();
        for (String month : months) {
            if (frequencyMap1.containsKey(month)) {
                frequencyMap1.put(month, frequencyMap1.get(month) + 1);
            } else {
                frequencyMap1.put(month, 1);
            }
        }
        System.out.println("Manual HashMap: " + frequencyMap1);

        // Using TreeMap (sorted)
        Map<String, Integer> frequencyMapTree = new TreeMap<>();
        for (String month : months) {
            frequencyMapTree.put(month, frequencyMapTree.getOrDefault(month, 0) + 1);
        }
        System.out.println("TreeMap (sorted): " + frequencyMapTree);

        // Stream API
         Map<String, Long> frequencyMap = new HashMap<>();
         months.stream().forEach(month -> 
            frequencyMap.put(month, frequencyMap.getOrDefault(month, 0L) + 1)
        );
        System.out.println("Frequency map using stream + getOrDefault: " + frequencyMap); 
    }
}