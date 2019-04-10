package _10_Facade;

public class CinemaFacad {
    Cinema cinema = new Cinema();
    Film film = new Film();
    Hall hall = new Hall();

    public void startSession() {
        cinema.startFilmPlay();
        film.startFilm();
        hall.watchFilms(film);
    }
}
