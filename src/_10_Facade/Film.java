package _10_Facade;

public class Film {
    private boolean activeFilm;

    public boolean isActiveFilm() {
        return activeFilm;
    }

    public void startFilm() {
        System.out.println("Film started");
        this.activeFilm = true;
    }

    public void stopFilm() {
        System.out.println("Film stoped");
        this.activeFilm = false;
    }
}
