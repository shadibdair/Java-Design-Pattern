package com.buildappswithpaulo.com;

public class MyClass {

    //Eagerly creating singleton class
    private static MyClass uniqueInstance = new MyClass();

    String name;

    private MyClass() {
    }

    public static MyClass  getInstance() {
        //Adding the synchronized keyword makes our singleton thread safe. Beware, though!
//        if (uniqueInstance == null) {
//            uniqueInstance = new MyClass();
//        }
        return uniqueInstance;
    }


}
