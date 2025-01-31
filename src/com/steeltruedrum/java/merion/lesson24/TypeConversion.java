package com.steeltruedrum.java.merion.lesson24;

public class TypeConversion {

    private static void runStringToByte() {
        String string = "111";
        Byte byte1 = Byte.valueOf(string);
        System.out.println(byte1);

        byte b2 = Byte.parseByte(string);
        System.out.println(b2);
    }

    public static void run() {
        runStringToByte();
    }
}
