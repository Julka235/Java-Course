package org.futurecollars.lesson4.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldReturnAreaOfATriangle() {
        // given
        double base = 4;
        double height = 4;
        double sideA = 3;
        double sideC = 5;
        Triangle triangle = new Triangle(base, height, sideA, sideC);
        // when
        double area = triangle.getArea();
        // then
        Assertions.assertEquals(8, area);
    }

    @Test
    void shouldReturnPerimeterOfATriangle() {
        // given
        double base = 4;
        double height = 4;
        double sideA = 3;
        double sideC = 5;
        Triangle triangle = new Triangle(base, height, sideA, sideC);
        // when
        double perimeter = triangle.getPerimeter();
        // then
        Assertions.assertEquals(12, perimeter);
    }
}