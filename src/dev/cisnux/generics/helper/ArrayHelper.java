package dev.cisnux.generics.helper;

public class ArrayHelper {
    @SafeVarargs
    public static <T> int count(T... array) {
        return array.length;
    }
}
