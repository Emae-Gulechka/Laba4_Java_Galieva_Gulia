package Laba4;

// Задание 1.2: Хранилище без null
public class Class_1_2<T> {
    private final T value;
    private final T alternative;

    public Class_1_2(T value, T alternative) {
        this.value = value;
        this.alternative = alternative;
    }

    public T getValue() {
        return value != null ? value : alternative;
    }

    @Override
    public String toString() {
        return "Хранилище{значение=" + value + ", альтернатива=" + alternative + "}";
    }
}
