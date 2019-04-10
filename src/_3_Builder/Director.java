package _3_Builder;

public class Director {
    public void createStandartCinema(Builder builder) {
        builder.setType(new TypeC(TypeOfHole.STANDART, 8, false));
        builder.setCountPlace(60);
        builder.setDisplay(Display.DISPLAY_2D);
        builder.setSeatPlaceType(Seat.SEAT_CHAIR);
    }

    public void createVipCinema(Builder builder) {
        builder.setType(new TypeC(TypeOfHole.VIP, 9, false));
        builder.setCountPlace(40);
        builder.setDisplay(Display.DISPLAY_3D);
        builder.setSeatPlaceType(Seat.SEAT_CHAIR);
    }

    public void createVipCinemaPlus(Builder builder) {
        builder.setType(new TypeC(TypeOfHole.VIP_PLUS, 10, true));
        builder.setCountPlace(30);
        builder.setDisplay(Display.DISPLAY_IMAX);
        builder.setSeatPlaceType(Seat.SEAT_SOFA);
    }
}
