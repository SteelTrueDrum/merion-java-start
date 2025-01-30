package com.steeltruedrum.java.merion.lesson8;

public class Cat extends Animal {
    public Cat(String name, Integer weight) {
        super(name, weight);
    }

    public Cat() {
    }

    private Integer getHeightCoefficient(Integer weight) {
        if (weight > 10) {
            return 120;
        }
        return 90;
    }

    public Integer getJumpHeight() {
        if (this.weight == null) return 300;
        return getHeightCoefficient(this.weight);
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }
}
