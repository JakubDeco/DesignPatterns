package sk.kosickaakademia.state;

public class App {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        Red red = new Red();
        Orange orange = new Orange();
        Green green = new Green();

        red.doAction(light);
        orange.doAction(light);
    }
}
