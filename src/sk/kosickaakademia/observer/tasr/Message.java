package sk.kosickaakademia.observer.tasr;

public class Message {
    private String content;
    private int priority;

    public Message(String content, int priority) throws InvalidPriorityValue {
        this.content = content;
        if (priority < 1 || priority > 4)
            throw new InvalidPriorityValue();
        else this.priority = priority;
    }

    public String getContent() {
        return content;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return priority + " " + content;
    }
}
