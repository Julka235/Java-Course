package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldReturnAreaOfARectangle() {
        // given
        double sideA = 4;
        double sideB = 2.5;
        // when
        Rectangle rectangle = new Rectangle(sideA, sideB);
        double area = rectangle.getArea();
        // then
        Assertions.assertEquals(10, area);
    }

    @Test
    void shouldReturnPerimeterOfARectangle() {
        // given
        double sideA = 4;
        double sideB = 2.5;
        // when
        Rectangle rectangle = new Rectangle(sideA, sideB);
        double perimeter = rectangle.getPerimeter();
        // then
        Assertions.assertEquals(13, perimeter);
    }
}