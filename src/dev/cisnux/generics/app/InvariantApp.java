package dev.cisnux.generics.app;

import dev.cisnux.generics.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<>("Fajra");
//        MyData<Object> dataObject = dataString; // error

        MyData<Object> data = new MyData<>(100);
//        MyData<Integer> dataInteger = data; // error
    }
}
