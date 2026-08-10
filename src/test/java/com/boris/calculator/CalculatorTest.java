package com.boris.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();


    @Test
    void testAddition() {

        double resultat =
                calculator.addition(5, 3);

        assertEquals(8, resultat);
    }


    @Test
    void testSoustraction() {

        double resultat =
                calculator.soustraction(10, 4);

        assertEquals(6, resultat);
    }


    @Test
    void testMultiplication() {

        double resultat =
                calculator.multiplication(4, 5);

        assertEquals(20, resultat);
    }


    @Test
    void testDivision() {

        double resultat =
                calculator.division(10, 2);

        assertEquals(5, resultat);
    }


    @Test
    void testDivisionParZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.division(10, 0)
        );
    }
}
