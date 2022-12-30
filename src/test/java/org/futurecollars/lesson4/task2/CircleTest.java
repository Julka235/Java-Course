package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldReturnAreaOfACircle() {
        // given
        double radius = 1.5;
        // when
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        // then
        Assertions.assertEquals(7.0685834705770345, area);
    }

    @Test
    void shouldReturnPerimeterOfACircle() {
        // given
        double radius = 1.5;
        // when
        Circle circle = new Circle(radius);
        double perimeter = circle.getPerimeter();
        // then
        Assertions.assertEquals(9.42477796076938, perimeter);
    }
}