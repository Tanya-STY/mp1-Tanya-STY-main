package com.bradteachescode.basiccalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example  local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /* Initial test for TDD */
    @Test
    public void testAddDecimalPoint() {
        assertEquals("Incorrect result",4.6, 2.4 + 2.2, 0.01);
    }
}

