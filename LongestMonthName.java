import java.util.*;

public class LongestMonthName {
    public static void main(String[] args) {

List<String> months = Arrays.asList(
    "January", "February", "March", "April",
    "May", "June", "July", "August",
    "September", "October", "November", "December"
);

String longest=" "; 
for (String month : months) {
    if (month.length() > longest.length()) {
        longest = month;
    }
}
System.out.println("Longest month: " + longest);

//Using Stram 
String longestMonthReduce = months.stream()
    .reduce("", (m1, m2) -> m1.length() >= m2.length() ? m1 : m2);
System.out.println("Longest month : " + longestMonthReduce);
}
}