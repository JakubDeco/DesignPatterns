package sk.kosickaakademia.state;

public class Green implements State {
    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("Light changed to green.");
        trafficLight.setState(this);
    }
}
