import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicateParticularIndex {
     public static void main(String[] args) {
       List<String> months = List.of("Jan", "Feb","March");

        Map<String, Integer> countMap = new HashMap<>();
        int duplicateCount = 0;
        String firstDuplicate = null;
        int firstDuplicateCount = 0;
        String thirdDuplicate = null;
        int thirdDuplicateCount = 0;

        for (String month : months) 
        {
        int count = countMap.getOrDefault(month, 0) + 1;
        countMap.put(month, count);
        if (count >= 1) 
        {
        duplicateCount++;
          if (duplicateCount == 1) {
                    firstDuplicate = month;
                    firstDuplicateCount = count;
                }

                if (duplicateCount == 3) {
                    thirdDuplicate = month;
                    thirdDuplicateCount = count;
                    break;
                }
            }
        }
        System.out.println("First duplicate element : " + firstDuplicate+"="+firstDuplicateCount);
        System.out.println("First duplicate element : " + thirdDuplicate+"="+thirdDuplicateCount);

    }  
}
