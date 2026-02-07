import java.util.*;

public class CountDuplicateElement 
{
    
     public static void main(String[] args) { 
        List<String> months = List.of("A", "B", "C", "A", "B"); 
        Map<String, Integer> countMap = new HashMap<>(); 
        int duplicateCount = 0; 
        for (String month : months) 
        { 
            int count = countMap.getOrDefault(month, 0) + 1; countMap.put(month, count); 
            if (count > 1) 
            { 
                duplicateCount++; 
            } 
        } 
        System.out.println("Number of duplicate elements: " + duplicateCount);
       
        //Using Stream api
        long c = months.stream()
        .filter(m -> Collections.frequency(months, m) > 1)
        .distinct()
        .count();
       
        System.out.println(c);
     
       
    }
}


    

