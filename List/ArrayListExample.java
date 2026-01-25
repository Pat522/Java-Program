package List;

import java.util.ArrayList;

public class ArrayListExample 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();  
        list.add(30);
        list.add(10);           
        list.add(20); 
        list.add(20); //Duplicate, will be added
        list.add(null); //Null value, will be added
        list.add(null); //Duplicate null, will be added  

    
      //Fast Random Access
      System.out.println(list.get(1)); // returns 15

      //Insert in Middle(Slow)
      list.add(1, 15); // adds 15 at index 1
      System.out.println("Added 15 at index 1: " + list);
        
    }
}
