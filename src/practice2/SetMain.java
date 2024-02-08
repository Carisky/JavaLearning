package src.practice2;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        // a.
        Set<String> set1 = new HashSet<>();

        // b.
        set1.add("Apple");
        set1.add("Banana");

        List<String> list1 = Arrays.asList("One", "Two", "Three");
        List<String> list2 = new ArrayList<>(list1);
        List<String> list3 = Arrays.asList("Four", "Five", "Six");

        // c.
        Set<String> set2 = new HashSet<>();
        set2.addAll(list1);
        set2.addAll(list2);

        // d.
        System.out.println(set2);

        // e.
        Set<String> set3 = new LinkedHashSet<>();
        set3.addAll(list2);
        set3.addAll(list3);

        // f.
        System.out.println(set3);
    }
}
