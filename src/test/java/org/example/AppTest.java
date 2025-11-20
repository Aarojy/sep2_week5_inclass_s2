package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void askInteger() {
        String simulatedInput = "42\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        int result = App.askInteger();
        assertEquals(42, result);
    }

    @Test
    void runLoop() {
        assertEquals(App.runLoop(10), 10);
    }

    @Test
    void testMain() {
        String simulatedInput = "42\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        App app = new App();
        app.main(new String[]{});
    }
}