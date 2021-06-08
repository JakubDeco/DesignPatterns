package sk.kosickaakademia.observer.border;

import sk.kosickaakademia.observer.border.observers.CarPlateCheck;
import sk.kosickaakademia.observer.border.observers.PassengerCheck;
import sk.kosickaakademia.observer.border.observers.WeightCheck;

public class App {
    public static void main(String[] args) {
        Border border = new Border();

        new WeightCheck(border);
        new PassengerCheck(border);
        new CarPlateCheck(border);

        Vehicle vehicle = new Vehicle("AS123CD",3.2,4);
        border.setVehicle(vehicle);
    }
}
