package _3_Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CinemaBuilder cinemaBuilder = new CinemaBuilder();
        director.createStandartCinema(cinemaBuilder);

        Cinema cinema =  cinemaBuilder.getCinema();
        System.out.println("We builded " + cinema.getType().getTypeHole() + " cinema");

        CinemaManualBuilder cinemaManualBuilder = new CinemaManualBuilder();
        director.createStandartCinema(cinemaManualBuilder);

        Manual manual = cinemaManualBuilder.getManual();
        System.out.println(manual.print());

// Build VIP Plus Cinema
        director.createVipCinemaPlus(cinemaBuilder);
        cinema =  cinemaBuilder.getCinema();
        System.out.println("We builded " + cinema.getType().getTypeHole() + " cinema");

        director.createVipCinemaPlus(cinemaManualBuilder);
        manual = cinemaManualBuilder.getManual();
        System.out.println(manual.print());
    }
}
