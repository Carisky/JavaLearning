package src.practice2;

import java.util.HashSet;
import java.util.Set;

public class UserSetMain {
    public static void main(String[] args) {
        // b.
        Set<User> userSet = new HashSet<>();

        // c.
        User user1 = new User("John", 25, "123456789");
        User user2 = new User("John", 25, "123456789");
        User user3 = new User("Jane", 30, "987654321");

        // d.
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        // e.
        System.out.println("Users in the set:");
        for (User user : userSet) {
            System.out.println(user);
        }

        // f.
        user1.hashCode();

        // g.
        System.out.println("\nUsers in the set after hashcode(name) override:");
        for (User user : userSet) {
            System.out.println(user);
        }

        // h.
        user1.hashCode();

        // i.
        System.out.println("\nUsers in the set after hashcode(all fields) override:");
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
