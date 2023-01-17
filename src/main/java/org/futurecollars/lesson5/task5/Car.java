package org.futurecollars.lesson5.task5;


public class Car extends Vehicle {
    private Engine engine;

    private Car(Engine engine){
        this.engine = engine;
    }

    public boolean isEngineStarted() {
        return engine.isStarted();
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }
}