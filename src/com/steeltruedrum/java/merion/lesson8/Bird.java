package com.steeltruedrum.java.merion.lesson8;

public class Bird extends Animal {
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    public final void takeOff() {
        this.flyModeActive = true;
    }

    public final void landing() {
        this.flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(
                flyModeActive ? "Flying mode: yes" : "Flying mode: no"
        );
    }
}
