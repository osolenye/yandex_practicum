package sprint4.hash_tables;

import java.util.HashMap;
import java.util.Map;

public class HashTables {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("US", "United States");
        countries.put("CA", "Canada");
        countries.put("US", "New value");
        System.out.println(countries);
        System.out.println(countries.getOrDefault("CA", "New value"));

        countries.keySet().forEach(System.out::println);
        countries.values().forEach(System.out::println);
        countries.entrySet().forEach(System.out::println);

        // lots of methods see in the docs RTFM
        // when using custom class as a key always override hashcode и equals
    }
}