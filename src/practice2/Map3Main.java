package src.practice2;

import java.util.*;

public class Map3Main {
    public static void main(String[] args) {
        // h.
        Map<String, Set<String>> map3 = new HashMap<>();
        Set<String> contacts = new HashSet<>(Arrays.asList("123456789", "student@example.com", "student_skype"));
        map3.put("John Doe", contacts);

        for (Map.Entry<String, Set<String>> entry : map3.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
