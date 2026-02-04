import java.util.*;

public class AscendindAndDescendingOrder {
    public static void main(String[] args) {
    List<Integer> lists = List.of(1,2,3,4,5,6);

    // Convert immutable List to mutable
    List<Integer> list = new ArrayList<>(lists);
    
    for (int i = 0; i < list.size(); i++) 
    for (int j = i + 1; j < list.size(); j++) 
        if (list.get(i) > list.get(j)) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
    }

    for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i)+" "+i); // [1, 2, 3, 4, 5]
}

    for (int i = 0; i < list.size(); i++) 
    for (int j = i + 1; j < list.size(); j++) 
        if (list.get(i) < list.get(j)) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    System.out.println(list); // [5, 4, 3, 2, 1]

//Using Strean API
    List<Integer> ascending =
        list.stream()
            .sorted()
            .toList();

    for (int i = 0; i < ascending.size(); i++) {
    System.out.println(ascending.get(i) + " " + i);
}

List<Integer> descending =
        list.stream()
            .sorted(Comparator.reverseOrder())
            .toList();

System.out.println(descending);   // [5, 4, 3, 2, 1]
    }
}