package com.example.injector;

import com.example.app.SomeBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class injectorTest {

    @Test
    void testDependencyInjection() throws Exception {
        Injector injector = new Injector();
        SomeBean bean = injector.inject(new SomeBean());

        assertNotNull(bean);
        assertDoesNotThrow(bean::foo);

        // Проверка вывода на экран
        // Вывод должен быть "AC"
    }
}
