package sk.kosickaakademia.observer.border.observers;


import sk.kosickaakademia.observer.border.Border;

public class WeightCheck extends Observer {
    public WeightCheck(Border border) {
        this.border = border;
        border.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Checking a car's weight.");
    }
}
