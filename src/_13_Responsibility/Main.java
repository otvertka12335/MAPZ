package _13_Responsibility;

public class Main {
    public static void main(String[] args) {
        Notifier reportNotifier = new ReportNotifier(Priority.SIMPLE);
        Notifier emailNotifier = new EmailReportNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsReportNotifier(Priority.DANGER);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyUser("Chota tam sly4ilos", Priority.IMPORTANT);

        reportNotifier.notifyUser("Chota", Priority.DANGER);
    }
}
