package FailFastandFailSafe;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeUsingConcurrentHashMap {
  public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Hibernate");

        Iterator<Entry<Integer,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            // modifying map during iteration (NO exception)
            map.put(4, "Microservices");
            System.out.println(iterator.next());

        }

    }
}
