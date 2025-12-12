package Laba4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Демонстрация всех заданий
        Class_1_2(scanner);
        System.out.println();
        Class_3_1(scanner);
        System.out.println();
        Class_3_2(scanner);
        System.out.println();
        Class_3_3(scanner);
        System.out.println();
        Class_3_4(scanner);


        scanner.close();
    }

    // Функция для демонстрации Class_1_2 (Задание 1.2 - Хранилище)
    public static void Class_1_2(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 1.2: ХРАНИЛИЩЕ БЕЗ NULL");

        System.out.println("\n--- Предопределенные примеры ---");
        System.out.println("\n1. Хранилище чисел (null, альтернатива 0):");
        Class_1_2<Integer> storage1 = new Class_1_2<>(null, 0);
        System.out.println("   " + storage1);
        System.out.println("   Полученное значение: " + storage1.getValue());

        System.out.println("\n2. Хранилище чисел (99, альтернатива -1):");
        Class_1_2<Integer> storage2 = new Class_1_2<>(99, -1);
        System.out.println("   " + storage2);
        System.out.println("   Полученное значение: " + storage2.getValue());

        System.out.println("\n3. Хранилище строк (null, альтернатива 'default'):");
        Class_1_2<String> storage3 = new Class_1_2<>(null, "default");
        System.out.println("   " + storage3);
        System.out.println("   Полученное значение: " + storage3.getValue());

        System.out.println("\n4. Хранилище строк ('hello', альтернатива 'hello world'):");
        Class_1_2<String> storage4 = new Class_1_2<>("hello", "hello world");
        System.out.println("   " + storage4);
        System.out.println("   Полученное значение: " + storage4.getValue());
    }

    // Функция для демонстрации Class_3_1 (Задание 3.1 - Функция)
    public static void Class_3_1(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 3.1: ФУНКЦИЯ (ПРЕОБРАЗОВАНИЕ)");

        System.out.println("\n--- 1. Преобразование строк в их длины ---");
        System.out.println("Исходный список: ['qwerty', 'asdfg', 'zx']");
        List<String> strings1 = Arrays.asList("qwerty", "asdfg", "zx");
        System.out.println("   Исходный список: " + strings1);

        List<Integer> lengths = Class_3_1.transform(strings1, s -> s.length());
        System.out.println("   Длины строк: " + lengths);

        System.out.println("\n--- 2. Преобразование чисел (|x|) ---");
        System.out.println("Исходный список: [1, -3, 7]");
        List<Integer> numbers2 = Arrays.asList(1, -3, 7);
        System.out.println("   Исходный список: " + numbers2);

        List<Integer> absNumbers = Class_3_1.transform(numbers2, n -> Math.abs(n));
        System.out.println("   Абсолютные значения: " + absNumbers);

        System.out.println("\n--- 3. Поиск максимумов в массивах ---");
        System.out.println("Исходный список массивов: [[1, 2, 3], [-5, 0, 5], [10, 20, 30, 5]]");
        List<int[]> arrays = Arrays.asList(
                new int[]{1, 2, 3},
                new int[]{-5, 0, 5},
                new int[]{10, 20, 30, 5}
        );

        System.out.println("   Исходные массивы:");
        for (int[] arr : arrays) {
            System.out.println("     " + Arrays.toString(arr));
        }

        List<Integer> maxValues = Class_3_1.transform(arrays, arr -> {
            int max = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > max) max = num;
            }
            return max;
        });

        System.out.println("   Максимальные значения: " + maxValues);
    }

    // Функция для демонстрации Class_3_2 (Задание 3.2 - Фильтр)
    public static void Class_3_2(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 3.2: ФИЛЬТР");

        System.out.println("\n--- 1. Фильтрация коротких строк (<3 символов) ---");
        System.out.println("Исходный список: ['qwerty', 'asdfg', 'zx']");
        List<String> strings1 = Arrays.asList("qwerty", "asdfg", "zx");
        System.out.println("   Исходный список: " + strings1);

        List<String> longStrings = Class_3_2.filter(strings1, s -> s.length() >= 3);
        System.out.println("   Строки длиной >=3: " + longStrings);

        System.out.println("\n--- 2. Фильтрация положительных чисел ---");
        System.out.println("Исходный список: [1, -3, 7]");
        List<Integer> numbers2 = Arrays.asList(1, -3, 7);
        System.out.println("   Исходный список: " + numbers2);

        List<Integer> nonPositiveNumbers = Class_3_2.filter(numbers2, n -> n <= 0);
        System.out.println("   Неположительные числа: " + nonPositiveNumbers);

        System.out.println("\n--- 3. Фильтрация массивов без положительных элементов ---");
        List<int[]> arrays = Arrays.asList(
                new int[]{-1, -2, -3},
                new int[]{-5, 0, 5},
                new int[]{-10, -20},
                new int[]{1, -2, 3}
        );

        System.out.println("   Исходные массивы:");
        for (int[] arr : arrays) {
            System.out.println("     " + Arrays.toString(arr));
        }

        List<int[]> arraysWithoutPositives = Class_3_2.filter(arrays, arr -> {
            for (int num : arr) {
                if (num > 0) return false;
            }
            return true;
        });

        System.out.println("   Массивы без положительных элементов:");
        for (int[] arr : arraysWithoutPositives) {
            System.out.println("     " + Arrays.toString(arr));
        }
    }

    // Функция для демонстрации Class_3_3 (Задание 3.3 - Сокращение)
    public static void Class_3_3(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 3.3: СОКРАЩЕНИЕ");

        System.out.println("\n--- 1. Сокращение строк ---");
        System.out.println("Исходный список: ['qwerty', 'asdfg', 'zx']");
        List<String> strings1 = Arrays.asList("qwerty", "asdfg", "zx");
        System.out.println("   Исходный список: " + strings1);

        String concatenated = Class_3_3.reduce(strings1,
                new Class_3_3.Reducer<String, String>() {
                    @Override
                    public String reduce(String accumulator, String current) {
                        return accumulator + current;
                    }
                }, "");
        System.out.println("   Результат сокращения: " + concatenated);

        System.out.println("\n--- 2. Сумма чисел ---");
        System.out.println("Исходный список: [1, -3, 7]");
        List<Integer> numbers2 = Arrays.asList(1, -3, 7);
        System.out.println("   Исходный список: " + numbers2);

        Integer sum = Class_3_3.reduce(numbers2, (acc, curr) -> acc + curr, 0);
        System.out.println("   Сумма: " + sum);

        System.out.println("\n--- 3. Общее количество элементов во вложенных списках ---");
        System.out.println("Исходный список списков: [[1, 2, 3], [4, 5], [6, 7, 8, 9]]");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        System.out.println("   Исходный список списков: " + listOfLists);


        // Прямой подсчет с помощью reduce (разные типы T и R)
        Integer directTotal = Class_3_3.reduce(listOfLists,
                (acc, curr) -> acc + curr.size(), 0);
        System.out.println("   Прямой подсчет:");
        System.out.println("   Общее количество элементов: " + directTotal);

        System.out.println("\n--- 4. Демонстрация с пустым списком ---");
        List<String> emptyList = new ArrayList<>();
        String emptyResult = Class_3_3.reduce(emptyList, (acc, curr) -> acc + curr, "пусто");
        System.out.println("   Результат для пустого списка: " + emptyResult);
    }
    // Функция для демонстрации Class_3_4 (Задание 3.4 - Коллекционирование)
    public static void Class_3_4(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 3.4: КОЛЛЕКЦИОНИРОВАНИЕ");

        System.out.println("\n--- 1. Разделение чисел на положительные и отрицательные ---");
        System.out.println("Исходный список: [1, -3, 7]");
        List<Integer> numbers1 = Arrays.asList(1, -3, 7);
        System.out.println("   Исходный список: " + numbers1);

        Map<String, List<Integer>> groupedNumbers = Class_3_4.collect(
                numbers1,
                () -> {
                    Map<String, List<Integer>> map = new HashMap<>();
                    map.put("positive", new ArrayList<>());
                    map.put("negative", new ArrayList<>());
                    map.put("zero", new ArrayList<>());
                    return map;
                },
                (map, num) -> {
                    if (num > 0) {
                        map.get("positive").add(num);
                    } else if (num < 0) {
                        map.get("negative").add(num);
                    } else {
                        map.get("zero").add(num);
                    }
                }
        );

        System.out.println("   Результат группировки:");
        System.out.println("     Положительные: " + groupedNumbers.get("positive"));
        System.out.println("     Отрицательные: " + groupedNumbers.get("negative"));
        System.out.println("     Нули: " + groupedNumbers.get("zero"));

        System.out.println("\n--- 2. Группировка строк по длине ---");
        System.out.println("Исходный список: ['qwerty', 'asdfg', 'zx', 'qw']");
        List<String> strings2 = Arrays.asList("qwerty", "asdfg", "zx", "qw");
        System.out.println("   Исходный список: " + strings2);

        Map<Integer, List<String>> groupedByLength = Class_3_4.collect(
                strings2,
                HashMap::new,
                (map, str) -> {
                    int length = str.length();
                    map.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
                }
        );

        System.out.println("   Группировка по длине:");
        for (Map.Entry<Integer, List<String>> entry : groupedByLength.entrySet()) {
            System.out.println("     Длина " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n--- 3. Подсчет частоты слов ---");
        System.out.println("Исходный список: ['qwerty', 'asdfg', 'qwerty', 'qw']");
        List<String> words3 = Arrays.asList("qwerty", "asdfg", "qwerty", "qw");
        System.out.println("   Исходный список: " + words3);

        Map<String, Integer> wordFrequency = Class_3_4.collect(
                words3,
                HashMap::new,
                (map, word) -> map.put(word, map.getOrDefault(word, 0) + 1)
        );

        System.out.println("   Частота слов:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("     " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Вспомогательный метод для получения целого числа с проверкой
    private static int getIntInput(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Пожалуйста, введите число от " + min + " до " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
            }
        }
    }
}