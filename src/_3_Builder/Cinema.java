package _3_Builder;

public class Cinema {
    private final TypeC type;
    private final int place;
    private final Display display;
    private final Seat seat;

    public Cinema(TypeC type, int place, Display display, Seat seat) {
        this.type = type;
        this.place = place;
        this.display = display;
        this.seat = seat;
    }

    public TypeC getType() {
        return type;
    }

    public int getPlace() {
        return place;
    }

    public Display getDisplay() {
        return display;
    }

    public Seat getSeat() {
        return seat;
    }
}
