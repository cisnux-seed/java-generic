package dev.cisnux.generics.app;

import dev.cisnux.generics.MyData;

// safe to read only
public class CovariantApp {
    public static void main(String[] args) {
        final MyData<String> data = new MyData<>("Fajra");
        process(data);
    }

    private static void process(MyData<? extends Object> data) {
        Object object = data.getData();
        System.out.println(object);
//        data.setData("Taka"); // error
    }
}
