package _11_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CinemaFactory {
    private static final Map<String, Cinema> cinemaMap = new HashMap<>();

    public Cinema getCinemaByType(String type) {
        Cinema cinema = cinemaMap.get(type);

        if(cinema == null) {
            switch (type) {
                case "standart":
                    System.out.println("Prepare Cinema Standart hall...");
                    cinema = new StandartCinema();
                    break;
                case "vip":
                    System.out.println("Prepare Cinema Vip hall...");
                    cinema = new Vip();
                    break;
            }
            cinemaMap.put(type, cinema);
        }
        return cinema;
    }
}
