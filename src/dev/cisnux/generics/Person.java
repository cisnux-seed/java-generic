package dev.cisnux.generics;

import java.util.Comparator;

public record Person(String name, String city, int age) implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
        return Comparator.comparing(Person::name)
                .thenComparing(Person::city)
                .thenComparing(Person::age)
                .compare(this, o);
    }
}
