package lists;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaHashTables {
    public void example() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");
//        System.out.println(map);
//        System.out.println(map.get("A"));
//        System.out.println(map.get("B"));
//        ArrayList<String> list = new ArrayList<>();
//        list.add(map.get("A"));
//        list.add(map.get("B"));
//        System.out.println("yes " + list.get(1));
        for (String tool : map.keySet()) {
            if (map.get(tool).equals("1")) {
                System.out.println(tool + " " + map.get(tool));
            }
        }

        if (map.containsKey("A")) {
            System.out.println(map.get("A"));
        }
    }
}