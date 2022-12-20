package org.futurecollars.lesson3.task5;

public class RightTriangle {

    public static boolean isTriangleRight(int sideA, int sideB, int sideC) {
        int sideASq = sideA * sideA;
        int sideBSq = sideB * sideB;
        int sideCSq = sideC * sideC;

        return (sideASq + sideBSq == sideCSq) || (sideASq + sideCSq == sideBSq) || (sideCSq + sideBSq == sideASq);
    }
}
