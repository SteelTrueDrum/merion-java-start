package com.steeltruedrum.java.merion;

import com.steeltruedrum.java.merion.lesson5.POJO;
import com.steeltruedrum.java.merion.lesson6.Animal;
import com.steeltruedrum.java.merion.lesson6.Cat;

public class Main {
    public static void main(String[] args) {

        // Lesson 5 - POJO
        POJO.run();

        // Lesson 6 - Instance of class
        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        // Lesson 7 - Package
        com.steeltruedrum.java.merion.lesson7.Cat catFromLesson7 = new com.steeltruedrum.java.merion.lesson7.Cat();
        catFromLesson7.voice();
    }
}
