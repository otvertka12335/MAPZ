package _10_Facade;

public class Hall {
    public void watchFilms(Film film) {
        if(film.isActiveFilm()) {
            System.out.println("Hall with people. Film started");
        } else {
            System.out.println("Hall is empty");
        }
    }
}
