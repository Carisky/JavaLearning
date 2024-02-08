package src.practice2;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        // a.
        List<String> list1 = new ArrayList<>();

        // b.
        String[] array = {"One", "Two", "Three"};
        list1.addAll(Arrays.asList(array));

        // c.
        List<String> list2 = new ArrayList<>(list1);

        // d.
        List<String> list3 = Arrays.asList("Four", "Five", "Six");

        // e.
        list2.addAll(list2.size() / 2, list3);

        // f.
        Collections.sort(list2, Collections.reverseOrder());

        // g.
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }

        System.out.println(list2);
    }
}
