package com.example;

import com.example.app.SomeBean;
import com.example.injector.Injector;

public class Main {
    public static void main(String[] args) throws Exception {
        Injector injector = new Injector();
        SomeBean bean = injector.inject(new SomeBean());
        bean.foo(); // Вывод: AC
    }
}
