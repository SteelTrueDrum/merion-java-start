package com.steeltruedrum.java.merion.lesson8;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
    }

    /**
     * Идем до позиции палки. Чтобы дойти до палки, нужно
     * определить разницу между текущей позицией и позицией палки
     *
     * @param stickPosition - позиция палки
     */

    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - currentPosition;
        runForward(delta);
    }

    public void getDogPosition() {
        System.out.println("Current position: " + currentPosition);
    }

    public static Dog ofHomeless(Integer weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("Woof!");
    }
}
