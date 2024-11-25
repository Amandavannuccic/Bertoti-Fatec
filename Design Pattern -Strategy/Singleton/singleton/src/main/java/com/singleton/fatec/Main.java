package com.singleton.fatec;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        if (singleton1 == singleton2) {
            System.out.println("singleton1 e singleton2 são a mesma instância.");
        } else {
            System.out.println("singleton1 e singleton2 são diferentes.");
        }
    
    }
}