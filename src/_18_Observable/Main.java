package _18_Observable;

public class Main {
    public static void main(String[] args) {
        Films films = new Films();

        films.addFilms("Venom");
        films.addFilms("Spider Man");

        Observer secondSubscriber = new User("fff");
        Observer firstSubscriber = new User("ddd");

        films.addObserver(firstSubscriber);
        films.addObserver(secondSubscriber);

        films.addFilms("Aqua man");
    }
}
