package dev.cisnux.generics;

public class Main {
    public static void main(String[] args) {
//        B b = (B) new A(); // error
        A a = new B(); // safe
    }

    public static class A {
    }

    public static class B extends A {
    }
}