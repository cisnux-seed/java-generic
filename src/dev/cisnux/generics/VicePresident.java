package dev.cisnux.generics;

public class VicePresident extends Employee implements Greeting {
    @Override
    public void sayHi(String name) {
        System.out.printf("Hi %s 🔥\n", name);
    }
}
