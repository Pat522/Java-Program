package List;

import java.util.LinkedList;

public class LinkedListExample 
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();  
        list.add(30);
        list.add(10);           
        list.add(20); 
        list.add(20); //Duplicate, will be added
        list.add(null); //Null value, will be added
        list.add(null); //Duplicate null, will be added  

      //Insert in Middle(Fast)
      list.add(1, 15); // adds 15 at index 1
      
      //Slow Random Access
      list.get(1); // returns 15
        
    }

}
