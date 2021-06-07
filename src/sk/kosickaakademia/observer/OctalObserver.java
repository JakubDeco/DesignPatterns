package sk.kosickaakademia.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal form is: " + Integer.toOctalString(subject.getState()));
    }
}
