package org.futurecollars.lesson5.task5;

public class Engine {
    private boolean isStarted;

    public boolean isStarted() {
        return isStarted;
    }

    public void start() {
        if (!isStarted) {
            isStarted = true;
        }
    }

    public void stop() {
        if (isStarted) {
            isStarted = false;
        }
    }
}
