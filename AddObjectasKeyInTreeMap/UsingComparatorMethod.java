package AddObjectasKeyInTreeMap;

import java.util.*;

class Employee 
{
    int id;
    String name;

    Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
   
}

public class UsingComparatorMethod {
    public static void main(String[] args) {

        //TreeMap with Comparator to sort by name
        TreeMap<Employee, Integer> salaryMap = new TreeMap<>(Comparator.comparing(emp -> emp.name));

        Employee e1 = new Employee(101, "Santosh");
        Employee e2 = new Employee(102, "Amit");


        salaryMap.put(e1, 50000);
        salaryMap.put(e2, 60000);

        // Print TreeMap entries
        salaryMap.forEach((employee, salary) -> 
            System.out.println(employee.id + " " + employee.name + " " + salary));
         
    }
}
