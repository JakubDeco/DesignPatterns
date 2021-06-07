package sk.kosickaakademia.observer.tasr.observers;

import sk.kosickaakademia.observer.tasr.Tasr;

public class FacebookGate extends Observer {
    public FacebookGate(Tasr tasr) {
        this.tasr = tasr;
        tasr.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Sending message via facebook about:" + tasr.getMessage().toString());
    }
}
