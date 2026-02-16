package hasing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class iteration {
    public static void main(String[] args) {

        // 1️⃣ Create HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // 2️⃣ Insert data (Key -> Value)
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);

        // =====================================================
        // 🔹 METHOD 1 : Iteration using keySet()
        // =====================================================

        // keySet() returns all keys of HashMap
        Set<String> keys = hm.keySet();

        System.out.println("Using keySet():");

        // for-each loop to iterate over keys
        for (String k : keys) {

            // hm.get(k) is used to get value using key
            System.out.println("Key = " + k + " , Value = " + hm.get(k));
        }


        // =====================================================
        // 🔹 METHOD 2 : Iteration using entrySet()  (BEST METHOD)
        // =====================================================

        System.out.println("\nUsing entrySet():");

        // entrySet() returns set of key-value pairs
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {

            // getKey() gives key
            String key = entry.getKey();

            // getValue() gives value
            int value = entry.getValue();

            System.out.println("Key = " + key + " , Value = " + value);
        }

    }
}
