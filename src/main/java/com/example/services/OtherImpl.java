package com.example.services;

/**
 * Реализация SomeInterface для выполнения действия B.
 */
public class OtherImpl implements SomeInterface {
    @Override
    public void doSomething() {
        System.out.print("B");
    }
}
