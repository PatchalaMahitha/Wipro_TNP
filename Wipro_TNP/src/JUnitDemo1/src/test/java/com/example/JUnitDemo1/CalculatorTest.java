package com.example.JUnitDemo1;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }
}
