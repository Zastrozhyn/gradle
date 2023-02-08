package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private static final String STRING_EXPECTED_TRUE = "101";
    private static final String STRING_EXPECTED_FALSE_INT = "-101";
    private static final String STRING_EXPECTED_FALSE = "Java";

    @Test
    void isPositiveNumberExpectedTrue() {
        assertTrue(App.isPositiveNumber(STRING_EXPECTED_TRUE));
    }

    @Test
    void isPositiveNumberExpectedFalseInt() {
        assertFalse(App.isPositiveNumber(STRING_EXPECTED_FALSE_INT));
    }

    @Test
    void isPositiveNumberExpectedFalseString() {
        assertFalse(App.isPositiveNumber(STRING_EXPECTED_FALSE));
    }
}