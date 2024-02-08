package src.practice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        // a.
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");

        // b.
        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        // c.
        map1.put(5, "VACATION");
        System.out.println("6th month: " + map1.get(5));

        // e.
        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        // g.
        printMap(map1);
        printMap(map2);
    }

    // g.
    private static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
