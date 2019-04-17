package _13_Responsibility;

public class ReportNotifier extends Notifier {

    public ReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier user, using report: " + message);
    }
}
