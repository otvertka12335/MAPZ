package _3_Builder;

public class Manual {
    private final TypeC type;
    private final int place;
    private final Display display;
    private final Seat seat;

    public Manual(TypeC type, int place, Display display, Seat seat) {
        this.type = type;
        this.place = place;
        this.display = display;
        this.seat = seat;
    }

    public String print() {
        String info = "";
        info += "Type of Cinema: " + type.getTypeHole() + " Volume: "
                + type.getVolume() + " Effects: " + type.isEffects() + "\n";

        info += "Count of Place: " + place + "\n";
        info += "Display Type: " + display + "\n";
        if(seat != null) {
            info += "Type of seat: " + seat + "\n";
        } else {
            info += "Type of seat: N/A" + "\n";
        }
        return info;
    }
}
