package dev.cisnux.generics.app;

import dev.cisnux.generics.helper.ArrayHelper;

public class GenericMethodApp {
    public static void main(String[] args) {
        String[] names = new String[]{"Fajra", "Risqulla", "Cisnux"};
        Integer[] numbers = new Integer[]{1, 2, 3, 4};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
