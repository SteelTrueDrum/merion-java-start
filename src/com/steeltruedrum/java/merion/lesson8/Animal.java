package com.steeltruedrum.java.merion.lesson8;

import java.util.Objects;

public class Animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    protected MoveType moveType;

    public Animal(String name, Integer weight, MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public Animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public void voice() {
        System.out.println("Voice!");
    }

    protected void runForward(Integer length) {
        this.currentPosition += length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(weight, animal.weight) && currentPosition.equals(animal.currentPosition) && moveType.equals(animal.moveType);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(weight);
        result = 31 * result + currentPosition.hashCode();
        result = 31 * result + moveType.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

}
