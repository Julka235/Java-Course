package org.futurecollars.lesson7.notes;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    public static void setup() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void init() {
        System.out.println("Before each");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After all");
    }

    @AfterEach
    public void clear() {
        System.out.println("After each");
    }

    @Test
    void sum() {
        System.out.println("Uruchomił się test");
    }
}