package sk.kosickaakademia.observer.border;


import sk.kosickaakademia.observer.border.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Border {
    private List<Observer> observers = new ArrayList<>();
    private Vehicle vehicle;


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
