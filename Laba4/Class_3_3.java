package Laba4;

import java.util.List;

// Задание 3.3: Сокращение
public class Class_3_3 {
    // Функциональный интерфейс
    public interface Reducer<T, R> {
        R reduce(R accumulator, T current);
    }

    // Универсальный метод сокращения списка
    public static <T, R> R reduce(List<T> list, Reducer<T, R> reducer, R initialValue) {
        if (list == null || list.isEmpty()) {
            return initialValue;
        }

        R result = initialValue;
        for (T item : list) {
            result = reducer.reduce(result, item);
        }
        return result;
    }

    // Вспомогательный метод для случаев когда T и R одинаковы (для обратной совместимости)
    public static <T> T reduceSameType(List<T> list, Reducer<T, T> reducer, T initialValue) {
        return reduce(list, reducer, initialValue);
    }

    @Override
    public String toString() {
        return "Класс для сокращения списков (reduce операция)";
    }
}