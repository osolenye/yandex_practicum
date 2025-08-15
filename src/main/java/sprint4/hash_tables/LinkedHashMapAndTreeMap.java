package sprint4.hash_tables;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAndTreeMap {
    public static void main(String[] args) {
//        Map<String, String> myMap = new LinkedHashMap<>();
        Map<String, String> myMap = new HashMap<>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
        myMap.put("4", "4");
        myMap.put("5", "5");

        for (String key : myMap.keySet()) {
            System.out.println(key + " " + myMap.get(key));
        }
    }
}
