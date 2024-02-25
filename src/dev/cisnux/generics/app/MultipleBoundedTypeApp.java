package dev.cisnux.generics.app;

import dev.cisnux.generics.Data;
import dev.cisnux.generics.VicePresident;

public class MultipleBoundedTypeApp {
    public static void main(String[] args) {
        // error bcs manager doesn't implement greeting
//        final var manager = new Data<>(new Manager());
        final var vicePresident = new Data<>(new VicePresident());
        vicePresident.getData().sayHi("Fajra");
    }
}
