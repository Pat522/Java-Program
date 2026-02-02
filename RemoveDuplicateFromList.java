import java.util.*;

public class RemoveDuplicateFromList  {
    public static void main(String[] args) {
        List<String> months = List.of(
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December",
            "January", "February", "March", "April", "May"
        );

        Set<String>removeDuplicate=new TreeSet<>(months);
        System.out.println("Remove Duplicate months: " + removeDuplicate);

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String month : months) {
            if (!seen.add(month)) { // if month is already in seen
                duplicates.add(month);
            }
        }
        System.out.println("Duplicate months: " + duplicates);
    }
}

