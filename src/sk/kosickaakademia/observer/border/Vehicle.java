package sk.kosickaakademia.observer.border;

public class Vehicle {
    private String vehiclePlate;
    private double weight;
    private int passengerCount;

    public Vehicle(String vehiclePlate, double weight, int passengerCount) {
        this.vehiclePlate = vehiclePlate;
        this.weight = weight;
        this.passengerCount = passengerCount;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public double getWeight() {
        return weight;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
