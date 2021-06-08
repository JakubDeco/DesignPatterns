package sk.kosickaakademia.observer.border.observers;

import sk.kosickaakademia.observer.border.Border;

public class CarPlateCheck extends Observer {
    public CarPlateCheck(Border border) {
        this.border = border;
        border.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Checking a car's licence plate.");
    }
}
