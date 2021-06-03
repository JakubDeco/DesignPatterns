package sk.kosickaakademia.state;

public class Red implements State {

    @Override
    public void doAction(TrafficLight trafficLight) {
        System.out.println("Light changed to red.");
        trafficLight.setState(this);
    }
}
