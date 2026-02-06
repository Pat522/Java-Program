import java.util.*;

public class LongestElement {
    public static void main(String[] args) {

List<String> months = List.of("January", "February", "March", "April", "May", "September");
String longest=" "; 
for (String month : months) {
    if (month.length() > longest.length()) {
        longest = month;
    }
}
System.out.println("Longest month: " + longest);


//Using Stream API
months.stream()
      .reduce((a, b) -> a.length() >= b.length() ? a : b)
      .orElse("");
       System.out.println("Longest month: " + longest);
    }
}

