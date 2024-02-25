package dev.cisnux.generics;

// single inheritance and multiple implements
public class Data<T extends Employee & Greeting> {
    private final T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
