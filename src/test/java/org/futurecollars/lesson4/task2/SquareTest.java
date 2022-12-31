package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldReturnAreaOfASquare() {
        // given
        double sideA = 3.5;
        Square square = new Square(sideA);
        // when
        double area = square.getArea();
        // then
        Assertions.assertEquals(12.25, area);
    }

    @Test
    void shouldReturnPerimeterOfASquare() {
        // given
        double sideA = 3.5;
        Square square = new Square(sideA);
        // when
        double perimeter = square.getPerimeter();
        // then
        Assertions.assertEquals(14, perimeter);
    }
}