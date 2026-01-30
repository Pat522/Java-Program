package HowToMakeListThradSafe;
import java.util.concurrent.CopyOnWriteArrayList;

public class UsingCopyonWriteArrayList {
    public static void main(String[] args) throws InterruptedException {

        // Thread-safe list
        CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();

        // Thread 1: add elements
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                list.add(i);
                System.out.println("Thread 1 added:" + i);
            }
        });

        // Thread 2: add elements
        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                list.add(i);
                System.out.println("Thread 2 added:" + i);
            }
        });


        // Start threads
        t1.start();
        t2.start();

        t1.join();
        t2.join();

       

        // Final list
        System.out.println("Final List: " + list);
        
        
       // synchronized (list){ //No need manual sync of itteration
   // for (Integer i : list) {
     //   System.out.println(i);
    //}
//}
    }
}
