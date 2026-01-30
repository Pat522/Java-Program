package HowToMakeMapThreadSafe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UsingConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {

        Map<Integer, String> map = new ConcurrentHashMap<>();

        // Thread 1: add keys 1-5
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    map.put(i, " Value " + i);
                     System.out.println("Thread-1 added: " + i );
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 6; i <= 10; i++) {
                    map.put(i, " Value " + i);
                    System.out.println("Thread-2 added: " + i );
                }
            }
        });

      

        t1.start();
        t2.start();

        t1.join();
        t2.join();

      

        // Final map
        System.out.println("\nFinal Map: " + map);

        // Iteration is safe; no need for synchronization
      //  for (Map.Entry<Integer, String> i : map.entrySet()) {
        //    System.out.println(i.getKey() + " => " + i.getValue());
        //}
    }
}
