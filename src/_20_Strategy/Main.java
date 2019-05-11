package _20_Strategy;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.setActivity(new BuyTicket());
        user.executeActivity();

        user.setActivity(new BuyPopCorn());
        user.executeActivity();

        user.setActivity(new LooksFilms());
        user.executeActivity();
    }
}
