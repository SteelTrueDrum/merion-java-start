package com.steeltruedrum.java.merion.lesson8;

public class Duck extends Bird {
    public static final String DUCK_VOICE = "Quack!";
    public static final Integer SPEED_FLY = 40;
    public static final Integer SPEED_WALK = 4;

    public Duck() {
        super();
    }

    @Override
    public void voice() {
        System.out.println(DUCK_VOICE);
    }

    public void showSpeed() {
        if (flyModeActive) {
            System.out.println("Duck speed: " + SPEED_FLY);
        } else {
            System.out.println("Duck speed: " + SPEED_WALK);
        }
    }
}
