package com.steeltruedrum.java.merion;

import com.steeltruedrum.java.merion.lesson5.POJO;
import com.steeltruedrum.java.merion.lesson8.Animal;
import com.steeltruedrum.java.merion.lesson8.Cat;
import com.steeltruedrum.java.merion.lesson8.Dog;
import com.steeltruedrum.java.merion.lesson8.Duck;

public class Main {
    public static void main(String[] args) {

        // Lesson 5 - POJO
        POJO.run();

        // Lesson 6 - Instance of class
//        Animal animal = new Animal();
//        animal.voice();
//
//        Cat cat = new Cat();
//        cat.voice();

//        // Lesson 7 - Package
//        com.steeltruedrum.java.merion.lesson7.Cat catFromLesson7 = new com.steeltruedrum.java.merion.lesson7.Cat();
//        catFromLesson7.voice();

//        // Lesson 8 - Methods
//        Animal animal = new Animal();
//        Animal animal1 = new Animal("any", 10);
//        Cat catFromLesson8 = new Cat("barsik", 20);
//        System.out.println(catFromLesson8.getJumpHeight());

//        // Lesson 9 - Methods modifiers
//        Dog dog = new Dog();
//        dog.goToStick(14);
//        dog.getDogPosition();
//        dog.goToStick(20);
//        dog.goToStick(5);
//        dog.getDogPosition();

//        Dog homelessDog = Dog.ofHomeless(10);
//        homelessDog.voice();
//
//        // Lesson 10 - Inheritance
//        Duck duck = new Duck();
//        duck.voice();
//        duck.takeOff();
//        duck.showSpeed();
//        duck.isTheBirdFlying();
//        duck.landing();
//        duck.showSpeed();
//        duck.isTheBirdFlying();

        // Lesson 11 - Arrays
        Dog[] dogsOfHomeless = new Dog[] {
                Dog.ofHomeless(1),
                Dog.ofHomeless(3),
                Dog.ofHomeless(6),
                Dog.ofHomeless(4)
        };

        for (Dog dog : dogsOfHomeless) {
            System.out.println(dog);
        }

        System.out.println("------");
        Dog[] dogs = Dog.randomArray();

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
