package com.steeltruedrum.java.merion.practice;

import java.util.Scanner;

/**
 * Задача 4. Перевод из градусов Цельсия в градусы Фаренгейта
 * Напишите программу, которая принимает температуру в градусах Цельсия и выводит ее эквивалент в градусах Фаренгейта.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double inputCelsuis = scanner.nextDouble();
        double result = convertCelsuisToFarenheit(inputCelsuis);
        System.out.println("Температура по Фаренгейту: " + result);

        scanner.close();
    }

    /**
     * @param inputCelsuis температура по Цельсию
     * @return возвращает double по Фаренгейту
     */
    public static double convertCelsuisToFarenheit(double inputCelsuis) {
        return ((inputCelsuis * 9.0 / 5.0) + 32);
    }
}
