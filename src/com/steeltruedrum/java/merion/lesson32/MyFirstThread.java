package com.steeltruedrum.java.merion.lesson32;

public class MyFirstThread extends Thread {

    public static void showThreads() {
        System.out.println("----");
        for (int i = 0; i < 10; i++) {
            MyFirstThread myFirstThread = new MyFirstThread();
            myFirstThread.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Это новый поток - " + getName());
    }
}
