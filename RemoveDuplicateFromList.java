import java.util.*;

public class RemoveDuplicateFromList  {
    public static void main(String[] args) {
        List<String> months = List.of("A","B","C","A","B" );


         //Dulicate Months
        Set<String> duplicateMonth = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String month : months) {
            if (!duplicateMonth.add(month)) { // if month is already in seen
                duplicates.add(month);
            }
        }
        System.out.println("Duplicate months: " + duplicates);

        //Unique Months
        Set<String> uniqueMonth = new HashSet<>();
        for(String month:months)
        {
            if(!duplicates.contains(month))
                uniqueMonth.add(month);
        }   
        System.out.println("Unique months: " + uniqueMonth);
       
    }
}

