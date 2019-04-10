package _3_Builder;

public class CinemaManualBuilder implements Builder {
    private TypeC type;
    private int place;
    private Display display;
    private Seat seat;

    @Override
    public void setType(TypeC type) {
        this.type = type;
    }

    @Override
    public void setCountPlace(int place) {
        this.place = place;
    }

    @Override
    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public void setSeatPlaceType(Seat seat) {
        this.seat = seat;
    }

    public Manual getManual() {
        return new Manual(type, place, display, seat);
    }
}
