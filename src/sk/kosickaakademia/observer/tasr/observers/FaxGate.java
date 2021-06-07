package sk.kosickaakademia.observer.tasr.observers;

import sk.kosickaakademia.observer.tasr.Tasr;

public class FaxGate extends Observer {
    public FaxGate(Tasr tasr) {
        this.tasr = tasr;
        tasr.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Sending message via fax about:" + tasr.getMessage().toString());
    }
}
