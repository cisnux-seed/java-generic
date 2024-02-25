package dev.cisnux.generics.app;

import dev.cisnux.generics.User;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        final var comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Comparator.comparing(User::name)
                        .thenComparing(User::city)
                        .thenComparing(User::age)
                        .compare(o1, o2);
            }
        };

        final User[] users = {
                new User("Fajra", "Singapore", 20),
                new User("Fajra", "Bandung", 22),
                new User("Cisnux", "Jambi", 18),
                new User("Risqulla", "Jakarta", 21)
        };

        Arrays.sort(users, comparator);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
