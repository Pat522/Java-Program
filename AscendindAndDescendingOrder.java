import java.util.*;

public class AscendindAndDescendingOrder {
    public static void main(String[] args) {
    List<String> months = List.of(
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December",
            "January", "February", "March", "April", "May");

    // Convert immutable List to mutable
    List<String> monthList = new ArrayList<>(months);

    // Sort in ascending order
    monthList.sort(Comparator.naturalOrder());       
    for (String month : monthList) 
    System.out.println(month);
        
    //Using Stream Api   
      months.stream()
      .sorted(Comparator.reverseOrder())
      .forEach(month -> System.out.println(month));
    //.forEach(System.out::println);//with method reference
     
 }   
}