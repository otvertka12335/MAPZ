package _10_Facade;

public class Main {
    public static void main(String[] args) {
//        Cinema cinema = new Cinema();
//        Film film = new Film();
//        film.startFilm();
//
//        Hall hall = new Hall();
//        hall.watchFilms(film);
//
//        film.stopFilm();
//        hall.watchFilms(film);

        CinemaFacad facad = new CinemaFacad();
        facad.startSession();
    }
}
