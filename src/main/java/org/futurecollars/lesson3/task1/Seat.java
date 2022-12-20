package org.futurecollars.lesson3.task1;

public class Seat {
    private final int seatNumber;
    private final int rowNumber;
    private boolean isOccupied;

    public Seat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}
