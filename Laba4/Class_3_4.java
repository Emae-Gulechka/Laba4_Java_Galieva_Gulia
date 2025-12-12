package Laba4;

import java.util.List;

// Задание 3.4: Коллекционирование
public class Class_3_4 {
    // Функциональные интерфейсы
    public interface CollectionFactory<P> {
        P create();
    }

    public interface Collector<T, P> {
        void collect(P collection, T value);
    }

    // Метод коллекционирования
    public static <T, P> P collect(List<T> list,
                                   CollectionFactory<P> factory,
                                   Collector<T, P> collector) {
        P result = factory.create();
        for (T item : list) {
            collector.collect(result, item);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Класс для коллекционирования (collect операция)";
    }
}
