package com.steeltruedrum.java.merion;

import com.steeltruedrum.java.merion.lesson16.SwitchExample;
import com.steeltruedrum.java.merion.lesson24.TypeConversion;
import com.steeltruedrum.java.merion.lesson28.AnonClass;
import com.steeltruedrum.java.merion.lesson30.LambdaExample;
import com.steeltruedrum.java.merion.lesson5.POJO;
import com.steeltruedrum.java.merion.lesson8.Animal;
import com.steeltruedrum.java.merion.lesson8.Cat;
import com.steeltruedrum.java.merion.lesson8.Dog;
import com.steeltruedrum.java.merion.lesson8.Duck;

import java.util.Arrays;
import java.util.List;

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
        Duck duck = new Duck();
        duck.voice();
        duck.takeOff();
        duck.showSpeed();
        duck.isTheBirdFlying();
        duck.landing();
        duck.showSpeed();
        duck.isTheBirdFlying();

//        // Lesson 11 - Arrays
//        List<Dog> dogsOfHomeless = Arrays.asList(new Dog[] {
//                Dog.ofHomeless(1),
//                Dog.ofHomeless(3),
//                Dog.ofHomeless(6),
//                Dog.ofHomeless(4)
//        });
//
//        for (Dog dog : dogsOfHomeless) {
//            System.out.println(dog);
//        }
//
//        System.out.println("------");
//        List<Dog> dogs = Dog.randomArray();
//
//        for (Dog dog : dogs) {
//            System.out.println(dog);
//        }
//
//        System.out.println(dogsOfHomeless.size());
//        System.out.println(dogsOfHomeless.get(2));

        // Lesson 16 - Switch
//        for (int i = 0; i < 50; i++) {
//            SwitchExample.run();
//        }

        // Lesson 20 - equals() & hashCode()
        Dog dogSharik = new Dog("Sharik", new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG));
        Dog dogBobik = new Dog("Bobik", new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG));
        Dog dogSharikVar1 = new Dog("Sharik", new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG));
        System.out.println(dogSharik.equals(dogBobik));
        System.out.println(dogSharik.equals(dogSharikVar1));

        // Lesson 22 - Enum
        System.out.println(" ");
        System.out.println(duck.getMoveType());

        // Lesson 24 - Type Conversion
        System.out.println(" ");
        TypeConversion.run();

        // Lesson 28 - Anonymous Class
        AnonClass.run();

        // Lesson 29 - Exception
//        try {
//            Dog dog22 = new Dog("Vasya", new Animal.AnimalWeight(-10, Animal.AnimalWeight.WeightType.KG));
//        } catch (Animal.WeightException e) {
//            e.printStackTrace();
//        }

        // Lesson 30 - Lambda Expression
        LambdaExample.run();

    }
}
