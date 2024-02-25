package dev.cisnux.generics.app;

//import dev.cisnux.generics.Pair;

import dev.cisnux.generics.Pair;

public class PairApp {
    public static void main(String[] args) {
        final var pair = new Pair<>("Indonesia", "Jakarta");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
