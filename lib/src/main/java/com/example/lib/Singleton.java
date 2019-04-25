package com.example.lib;

public class Singleton {

    private static Singleton singleton = new Singleton();
    private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }

    public void doSomething() {
        System.out.println("hello world");
    }
}
