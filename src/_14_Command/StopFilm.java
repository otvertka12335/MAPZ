package _14_Command;

public class StopFilm implements Command {
    Cinema cinema;

    public StopFilm(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void execute() {
        cinema.stopFilm();
    }
}
