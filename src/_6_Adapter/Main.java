package _6_Adapter;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(10);
        StandartCinema standartCinema = new StandartCinema(10);
        if(cinema.fits(standartCinema)) {
            System.out.println("RIVNI");
        }

        VipCinema smallVip = new VipCinema(5);
        VipCinema largeVip = new VipCinema(15);
//        cinema.fits(smallVip);
        Adapter smallAdapter = new Adapter(smallVip);
        Adapter largeAdapter = new Adapter(largeVip);
        if(cinema.fits(smallAdapter)) {
            System.out.println("VIP 5 sofa fits for cinema 10");
        }
        if(!cinema.fits(largeAdapter)) {
            System.out.println("VIP 15 sofa does not fits for cinema 10");
        }
    }
}
