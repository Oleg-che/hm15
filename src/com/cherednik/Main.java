package com.cherednik;
/*
 Создать список случайных чисел.
Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.
 */
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10 ; i++) {
            list.add(random.nextInt(10) + 1);
        }
        System.out.println(list);
        double sqrt = list.stream()
                .map(x -> x * x)
                .flatMapToInt(IntStream::of)
                .average()
                .getAsDouble();
        System.out.println("Average is " + sqrt);
    }

}
