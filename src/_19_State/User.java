package _19_State;

public class User {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof BuyTicket) {
            setActivity(new BuyPopCorn());
        } else if(activity instanceof BuyPopCorn) {
            setActivity(new LooksFilms());
        } else {
            setActivity(new BuyTicket());
        }
    }

    public void doSomething() {
        activity.doSomething();
    }
}
