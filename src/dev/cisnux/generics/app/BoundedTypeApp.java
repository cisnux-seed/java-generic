package dev.cisnux.generics.app;

public class BoundedTypeApp {
    public static void main(String[] args) {
        final var integerNumberData = new NumberData<>(200);
        System.out.println(integerNumberData.getData());

        final var floatNumberData = new NumberData<>(2.0f);
        System.out.println(floatNumberData.getData());

        final var doubleNumberData = new NumberData<>(2.0);
        System.out.println(doubleNumberData.getData());

        // error
//        final var stringNumberData = new NumberData<>("Fajra");
    }
}
