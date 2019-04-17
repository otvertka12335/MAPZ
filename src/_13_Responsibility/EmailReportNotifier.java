package _13_Responsibility;

public class EmailReportNotifier extends Notifier {

    public EmailReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SENDING Email... " + message);
    }
}
