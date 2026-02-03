import java.util.List;

public class FindStartWithParticularAlphabet {
    public static void main(String[] args) {
      List<String> months = List.of("A", "B", "C", "a", "b","a", "B", "C", 
               "A", "B","A", "B", "C", "A", "B");

       for (String month : months) {
            if (month.toUpperCase().startsWith("A") && month.equals(month.toUpperCase())) {
                System.out.println(month);
            }
        }
       
        //Using Stream
         months.stream()
        .filter(m -> m.toLowerCase().startsWith("a"))
        .filter(m -> m.equals(m.toLowerCase())) 
        .forEach(m->System.out.println(m));
        // .forEach(System.out::println);

    }
}
