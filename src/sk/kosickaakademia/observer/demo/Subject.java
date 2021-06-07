package sk.kosickaakademia.observer.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
