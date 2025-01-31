package com.steeltruedrum.java.merion.lesson8;

public enum MoveType {
    WALK("Ходит"), SWIM("Плавает"), FLY("Летает");

    private final String value;

    MoveType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
