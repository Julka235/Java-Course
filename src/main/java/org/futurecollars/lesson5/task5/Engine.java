package org.futurecollars.lesson5.task5;

public class Engine {
    private boolean isStarted;

    public void setStateOfTheEngine(boolean started) {
        this.isStarted = started;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void startEngine() {
        if (!isStarted) {
            isStarted = true;
        }
    }

    public void stopEngine() {
        if (isStarted) {
            isStarted = false;
        }
    }
}
