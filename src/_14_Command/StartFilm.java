package _14_Command;

public class StartFilm implements Command {
    Cinema cinema;

    public StartFilm(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void execute() {
        cinema.startFilm();
    }
}
