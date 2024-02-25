package dev.cisnux.generics.app;

import dev.cisnux.generics.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<String>("Test");
        MyData<Integer> myDataInteger = new MyData<>(2);
        final var myDataBoolean = new MyData<>(false);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
        System.out.println(myDataBoolean.getData());
    }
}
