package sk.kosickaakademia.observer.demo;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
