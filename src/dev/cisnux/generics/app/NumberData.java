package dev.cisnux.generics.app;

public class NumberData<T extends Number> {
    private final T data;

    public NumberData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
