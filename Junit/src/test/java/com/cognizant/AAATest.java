package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AAATest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up Calculator...");
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }
}