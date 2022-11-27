package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator = new SimpleCalculator();

    @Test
    void addTwoNumbersSumIsFour() {
        assertEquals(4, calculator.add(2, 2));
    }
}