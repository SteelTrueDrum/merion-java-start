package com.steeltruedrum.java.merion.lesson31;

import com.steeltruedrum.java.merion.lesson8.Animal;
import com.steeltruedrum.java.merion.lesson8.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void run() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumberStreamAPI(list));

        workWithNumbers();
        workWithString();
        workWithObjects();

    }

    public static List<Integer> getEvenNumber(List<Integer> input) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : input) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static List<Integer> getEvenNumberStreamAPI(List<Integer> input) {
        return input.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void workWithNumbers() {
        List<Integer> numbers = List.of(1, -1, -8, 11, 20, 30, 44);
        numbers.stream()
                .filter(num -> num > 0)
                .forEach(num -> {
                    System.out.println(num);
                });

        int result = numbers.stream()
                .filter(n -> n > 0)
                .min((x, y) -> Integer.compare(x, y))
                .orElse(0);
        System.out.println(result);

        int sum = numbers.stream()
                .reduce((x, y) -> x + y)
                .orElse(0);
        System.out.println(sum);

    }

    private static void workWithString() {
        List<String> names = List.of("Ivan", "Max", "Oleg", "Anton", "");

        names = names.stream()
                .filter(s -> s.isBlank() == false)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);

        long amount = names.stream()
                .filter(s -> s.startsWith("O"))
                .count();
        System.out.println(amount);
    }

    private static void workWithObjects() {
        List<Dog> dogs = List.of(
                Dog.of("Sharik", new Animal.AnimalWeight(1, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Bobik", new Animal.AnimalWeight(1, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Tuzik", new Animal.AnimalWeight(1, Animal.AnimalWeight.WeightType.KG))
        );

        Map<String, List<Dog>> dogMap = dogs.stream()
                .collect(Collectors.groupingBy(
                        dog -> String.valueOf(dog.getName().charAt(0)), Collectors.toList()
                ));

        System.out.println(dogMap);
    }

}
