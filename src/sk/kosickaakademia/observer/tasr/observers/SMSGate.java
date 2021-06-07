package sk.kosickaakademia.observer.tasr.observers;

import sk.kosickaakademia.observer.tasr.Tasr;

public class SMSGate extends Observer {

    public SMSGate(Tasr tasr) {
        this.tasr = tasr;
        tasr.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Sending message via SMS about:" + tasr.getMessage().toString());
    }
}
