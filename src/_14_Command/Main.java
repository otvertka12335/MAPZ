package _14_Command;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        CinemaManager cinemaManager = new CinemaManager(new StartFilm(cinema), new StopFilm(cinema));

        cinemaManager.startFilm();
        System.out.println("---===FILMS===---");
        cinemaManager.stopFilm();
    }
}
