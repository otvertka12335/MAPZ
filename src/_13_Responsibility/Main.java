package _13_Responsibility;

public class Main {
    public static void main(String[] args) {
        Notifier reportNotifier = new ReportNotifier(Priority.SIMPLE);
        Notifier emailNotifier = new EmailReportNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsReportNotifier(Priority.DANGER);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyUser("Your session will begin in 2 hours", Priority.IMPORTANT);

        reportNotifier.notifyUser("Your session will begin in 30 minutes", Priority.DANGER);
    }
}
