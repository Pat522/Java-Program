package HowToMakeListThradSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingCollectionssynchronized {

    public static void main(String[] args) throws  InterruptedException {

// Create a synchronized List
List<Integer>list =Collections.synchronizedList(new ArrayList<>());

  // Thread 1: adds numbers without lamda 
Thread t1 = new Thread(new Runnable() {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            System.out.println("Thread-1 added: " + i);
        }
    }
});

// Thread 2: adds numbers with lamda
Thread t2 = new Thread(() -> {
    for (int i = 6; i <= 10; i++) {
                list.add(i);
                System.out.println("Thread-2 added: " + i);
            }
        });

        // Start threads
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
  
        // Print final list
        System.out.println("Final List: " + list);
       
       // Even with synchronizedList, iteration must be manually synchronized:
        synchronized (list) {
        for (Integer i : list) {
        System.out.println(i);
       }
    }
 }
}
