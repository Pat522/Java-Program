package Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

//import AddObjectasKeyInTreeMap.Employee;

//Employee class with id and name
class Employee 
{
    int id;
    String name;

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
// Override hashCode() for proper hashing in HashMap
 @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }   

// Override equals() to compare Employee objects by id and name
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (!(obj instanceof Employee emp)) return false;

//Employee emp = (Employee) obj;
return id == emp.id && name.equals(emp.name);
    }
}

public class AddObjectAsKeyInHashMapExample  
{
    public static void main(String[] args) {
        // Create a HashMap with Employee as key and Integer as value
        Map<Employee, Integer> salaryMap = new HashMap<>();

        // Create Employee objects
      Employee e1 = new Employee(101, "Santosh");
Employee e2 = new Employee(102, "Amit");
        
// Put employees and their salaries
salaryMap.put(e1, 50000);
salaryMap.put(e2, 60000);
        

// Print TreeMap entries
for(Map.Entry<Employee, Integer> entry : salaryMap.entrySet()) 
{
System.out.println("Employee ID: " + entry.getKey().id 
+ ",Name: " +entry.getKey().name 
+ "->Salary:" +entry.getValue());
        }
    }
}