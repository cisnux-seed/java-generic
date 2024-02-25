package dev.cisnux.generics.app;

import dev.cisnux.generics.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        final Person[] persons = {
                new Person("Fajra", "Singapore", 20),
                new Person("Fajra", "Bandung", 22),
                new Person("Cisnux", "Jambi", 18),
                new Person("Risqulla", "Jakarta", 21)
        };

        Arrays.sort(persons);
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
