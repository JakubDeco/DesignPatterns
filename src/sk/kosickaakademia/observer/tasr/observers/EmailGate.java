package sk.kosickaakademia.observer.tasr.observers;

import sk.kosickaakademia.observer.tasr.Tasr;

public class EmailGate extends Observer {
    public EmailGate(Tasr tasr) {
        this.tasr = tasr;
        tasr.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Sending message via email about:" + tasr.getMessage().toString());
    }
}
