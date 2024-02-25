package dev.cisnux.generics.app;

import dev.cisnux.generics.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        // not safe
        MyData myData = new MyData<>("test");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
//        integerMyData.setData(1000);

        Integer integer = integerMyData.getData();
        System.out.println(integer);
    }
}
