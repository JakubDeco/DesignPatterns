package sk.kosickaakademia.observer.tasr;

import sk.kosickaakademia.observer.tasr.observers.EmailGate;
import sk.kosickaakademia.observer.tasr.observers.FacebookGate;
import sk.kosickaakademia.observer.tasr.observers.FaxGate;
import sk.kosickaakademia.observer.tasr.observers.SMSGate;

public class App {
    public static void main(String[] args) {
        Tasr tasr = new Tasr();
        Message m1 = new Message("Canada won",2);

        new EmailGate(tasr);
        new FacebookGate(tasr);
        new FaxGate(tasr);
        new SMSGate(tasr);

        tasr.setMessage(m1);
    }
}
