package com.example.app;

import com.example.annotations.AutoInjectable;
import com.example.services.SomeInterface;
import com.example.services.SomeOtherInterface;

/**
 * Класс с автоматически внедряемыми полями.
 */
public class SomeBean {

    @AutoInjectable
    private SomeInterface field1;

    @AutoInjectable
    private SomeOtherInterface field2;

    /**
     * Метод демонстрации работы внедрения зависимостей.
     */
    public void foo() {
        field1.doSomething();
        field2.doSomeOther();
    }
}
