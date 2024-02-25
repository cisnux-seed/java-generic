package dev.cisnux.generics.app;

import dev.cisnux.generics.MyData;


// safe to write only
public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Fajra");
        MyData<? super String> myData = objectMyData;

        System.out.println(objectMyData.getData());
        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    private static void process(MyData<? super String> myData) {
        myData.setData("Cisnux");
//        String data = (String) myData.getData();// not safe
//        System.out.println(data);
    }
}
