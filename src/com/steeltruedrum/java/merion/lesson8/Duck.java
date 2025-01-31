package com.steeltruedrum.java.merion.lesson8;

public class Duck extends Bird {
    public Duck() {
        super();
    }

    @Override
    public void voice() {
        System.out.println("Quack!");
    }

    public void showSpeed() {
        if (flyModeActive){
            System.out.println("Duck speed: 40");
        } else {
            System.out.println("Duck speed: 4");
        }
    }
}
