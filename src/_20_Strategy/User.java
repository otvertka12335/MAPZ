package _20_Strategy;

public class User {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.doSomething();
    }

    public void doSomething() {
        activity.doSomething();
    }
}
