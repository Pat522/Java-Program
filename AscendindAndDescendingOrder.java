import java.util.*;

public class AscendindAndDescendingOrder {
    public static void main(String[] args) {
    List<String> months = List.of("A", "B", "C", "A", "B");

    // Convert immutable List to mutable
    List<String> orderMonths = new ArrayList<>(months);

    // Sort in ascending order
    orderMonths.sort(Comparator.naturalOrder());       
    for (String month : orderMonths) 
    System.out.println(month);
        
    //Using Stream Api  
      months.stream()
      .sorted(Comparator.reverseOrder())
      .forEach(month -> System.out.println(month));
    //.forEach(System.out::println);//with method reference
     
 }   
}