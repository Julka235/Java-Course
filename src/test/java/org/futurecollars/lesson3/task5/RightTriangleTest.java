package org.futurecollars.lesson3.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    @Test
    void shouldReturnTrueWhenTriangleRight() {
        // given
        int sideA = 5;
        int sideB = 4;
        int sideC = 3;
        // when
        boolean isRight = RightTriangle.isTriangleRight(sideA, sideB, sideC);
        // then
        Assertions.assertEquals(true, isRight);
    }

    @Test
    void shouldReturnFalseWhenTriangleNotRight() {
        // given
        int sideA = 8;
        int sideB = 6;
        int sideC = 7;
        // when
        boolean isRight = RightTriangle.isTriangleRight(sideA, sideB, sideC);
        // then
        Assertions.assertEquals(false, isRight);
    }
}