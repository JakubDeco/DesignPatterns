package sk.kosickaakademia.observer.tasr;

import sk.kosickaakademia.observer.tasr.observers.*;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private List<Observer> observers = new ArrayList<>();
    private Message message;

    public void setMessage(Message message) {
        this.message = message;
        notifyObserversByPriority(message.getPriority());
    }

    public Message getMessage() {
        return message;
    }

    public void notifyObserversByPriority(int priority){
        switch (priority){
            case 1 -> observers.forEach(Observer::update);
            case 2 -> observers.forEach(observer -> {
                if (!(observer instanceof SMSGate))
                    observer.update();
            });
            case 3 -> observers.forEach(observer -> {
                if (observer instanceof EmailGate || observer instanceof FacebookGate)
                    observer.update();
            });
            case 4 -> observers.forEach(observer -> {
                if (observer instanceof EmailGate)
                    observer.update();
            });
        }
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
