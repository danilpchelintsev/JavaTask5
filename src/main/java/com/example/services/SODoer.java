package com.example.services;

/**
 * Реализация SomeOtherInterface для выполнения действия C.
 */
public class SODoer implements SomeOtherInterface {
    @Override
    public void doSomeOther() {
        System.out.print("C");
    }
}
