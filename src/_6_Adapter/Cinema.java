package _6_Adapter;

public class Cinema {
    private int place;

    public Cinema(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    public boolean fits(StandartCinema standartCinema) {
        return (this.getPlace() >= standartCinema.getPlace());
    }
}
