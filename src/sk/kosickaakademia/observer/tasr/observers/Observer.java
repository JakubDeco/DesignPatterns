package sk.kosickaakademia.observer.tasr.observers;

import sk.kosickaakademia.observer.tasr.Tasr;

public abstract class Observer {
    protected Tasr tasr;
    public abstract void update();
}
