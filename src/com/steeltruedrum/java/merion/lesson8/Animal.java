package com.steeltruedrum.java.merion.lesson8;

public class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {

    }

    public void voice() {
        System.out.println("Voice!");
    }

    protected void runForward(Integer length) {
        this.currentPosition += length;
    }

}
