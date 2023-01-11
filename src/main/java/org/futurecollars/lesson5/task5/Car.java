package org.futurecollars.lesson5.task5;


public class Car extends Vehicle implements Engine {
    private boolean engineStarted;

    @Override
    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    @Override
    public boolean isEngineStarted() {
        return engineStarted;
    }

    @Override
    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    @Override
    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }
}