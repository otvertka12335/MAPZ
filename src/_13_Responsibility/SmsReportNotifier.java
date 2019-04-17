package _13_Responsibility;

public class SmsReportNotifier extends Notifier {

    public SmsReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SENDING SMS... " + message);
    }
}
