package AddObjectasKeyInTreeMap;
import java.util.Map;
import java.util.TreeMap;

//Using Comparable(CompareTo method)-
class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Compare by id for TreeMap sorting
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}

public class UsingComparableMethod {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> salaryMap = new TreeMap<>();

        Employee e1 = new Employee(101, "Santosh");
        Employee e2 = new Employee(102, "Amit");

        // Put employees and their salaries
        salaryMap.put(e1, 50000);
        salaryMap.put(e2, 60000);

        // Print TreeMap entries
        for (Map.Entry<Employee, Integer> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey().id +" "+ entry.getKey().name + " " + entry.getValue());
        }
    }
}


