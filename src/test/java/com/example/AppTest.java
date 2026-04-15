package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for Odd/Even App.
 */
public class AppTest {

    @Test
    public void testEvenNumber() {
        App app = new App();
        // Assert that 4 returns "Even"
        assertEquals("Even", app.checkOddEven(4));
    }

    @Test
    public void testOddNumber() {
        App app = new App();
        // Assert that 7 returns "Odd"
        assertEquals("Odd", app.checkOddEven(7));
    }

    @Test
    public void testZero() {
        App app = new App();
        // Zero is typically considered Even
        assertEquals("Even", app.checkOddEven(0));
    }
}
