package _13_Responsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyUser(String message, int levelPriority) {
        if(levelPriority == priority) {
            write(message);
        }
        if(nextNotifier != null) {
            nextNotifier.notifyUser(message, levelPriority);
        }
    }

    public abstract void write(String message);
}
