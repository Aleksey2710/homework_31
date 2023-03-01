import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static Random random = new Random();

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача №1\n");

        /**
         * Задание 1
         *
         * Напишите метод findMinMax, находящий в стриме минимальный и максимальный элементы в соответствии порядком,
         * заданным Comparator'ом.
         *
         * Данный метод принимает на вход 3 элемента:
         *
         * Stream<? extends T> stream,
         * Comparator<? super T> order,
         * BiConsumer<? super T, ? super T> minMaxConsumer
         * Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
         *
         * minMaxConsumer.accept(min, max);
         * Если стрим не содержит элементов, то вызовите
         *
         * minMaxConsumer.accept(null, null);
         * Критерии
         *
         * Задача решена корректно
         * Реализация через коллекцию(Например List или Queue)
         * Логически верно определили результат
         * Корректное получение необходимых данных
         * Соблюден кодстайл
         */

    }

    public static void findMinMax(Stream<Integer> stream,
                                  Comparator<Integer> order,
                                  BiConsumer<Integer, Integer> minMaxConsumer) {

        Integer min;
        Integer max;

        list = stream
                .sorted(order)
                .collect(Collectors.toList());

        if (!list.isEmpty()) {
            min = list.get(0);
            max = list.get(list.size() - 1);

            minMaxConsumer.accept(min, max);
        }
    }

    public static void task2() {
        System.out.println("\nЗадача №2\n");

        /**
         * Задание 2
         * Реализуйте метод, который принимает на вход Список целых чисел и определяет количество четных и выводит
         * их в консоль. Решать именно с применением Stream API
         *
         * Критерии
         * Задача решена корректно
         * Задача решена одним из двух способов
         * Соблюден кодстайл
         * Правильно реализован предикат //!!! не понял, зачем тут Predicate, нам же нужно вернуть количество, а не boolean?
         */

        for (int i = 0; i < 50; i++) {
            list.add(i, random.nextInt(1000));
        }

        System.out.println(list);

        getCountEvenNumbers(list);
    }

    public static void getCountEvenNumbers(List<Integer> listNumbers) {
        System.out.println(listNumbers.stream()
                .filter(x -> x % 2 == 0)
                .peek(System.out::println).count());
    }
}
