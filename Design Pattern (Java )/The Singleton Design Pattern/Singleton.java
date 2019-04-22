package com.buildappswithpaulo.com;

public class Singleton {

    //Eagerly creating singleton class
   // private static Singleton uniqueInstance = new Singleton();

    private volatile static Singleton uniqueInstance;
    String name;

    private Singleton() {
    }

    //Double-Check locking.
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized ( (Singleton.class)) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
