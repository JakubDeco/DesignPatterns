package sk.kosickaakademia.observer.demo;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary form is: " + Integer.toBinaryString(subject.getState()));
    }
}
