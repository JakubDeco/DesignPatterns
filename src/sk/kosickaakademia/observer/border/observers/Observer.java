package sk.kosickaakademia.observer.border.observers;

import sk.kosickaakademia.observer.border.Border;

public abstract class Observer {
    protected Border border;
    public abstract void update();
}
