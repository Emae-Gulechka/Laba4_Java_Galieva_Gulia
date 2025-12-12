package Laba4;

import java.util.ArrayList;
import java.util.List;

// Задание 3.2: Фильтр
public class Class_3_2 {
    // Функциональный интерфейс
    public interface Predicate<T> {
        boolean test(T value);
    }

    // Метод фильтрации списка
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Класс для фильтрации списков (filter операция)";
    }
}
