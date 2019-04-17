package _14_Command;

public class CinemaManager {
    Command start;
    Command stop;

    public CinemaManager(Command start, Command stop) {
        this.start = start;
        this.stop = stop;
    }

    void startFilm() {
        start.execute();
    }

    void stopFilm() {
        stop.execute();
    }
}
