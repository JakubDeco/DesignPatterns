package sk.kosickaakademia.state;

public class Orange implements State {
    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("Light changed to orange.");
        trafficLight.setState(this);
    }
}
