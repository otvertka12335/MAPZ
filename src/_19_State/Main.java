package _19_State;

public class Main {
    public static void main(String[] args) {
        Activity activity = new BuyTicket();
        User user = new User();

        user.setActivity(activity);

        for(int i = 0; i < 4; i++) {
            user.doSomething();
            user.changeActivity();
        }
    }
}
