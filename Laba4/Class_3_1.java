package Laba4;

import java.util.ArrayList;
import java.util.List;

// Задание 3.1: Функция
public class Class_3_1 {
    // Функциональный интерфейс
    public interface Transformer<T, P> {
        P apply(T value);
    }

    // Метод преобразования списка
    public static <T, P> List<P> transform(List<T> list, Transformer<T, P> transformer) {
        List<P> result = new ArrayList<>();
        for (T item : list) {
            result.add(transformer.apply(item));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Класс для преобразования списков (map операция)";
    }
}
