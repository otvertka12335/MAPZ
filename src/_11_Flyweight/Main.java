package _11_Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CinemaFactory factory = new CinemaFactory();

        List<Cinema> cinemas = new ArrayList<>();

        cinemas.add(factory.getCinemaByType("standart"));
        cinemas.add(factory.getCinemaByType("standart"));
        cinemas.add(factory.getCinemaByType("standart"));
        cinemas.add(factory.getCinemaByType("standart"));
        cinemas.add(factory.getCinemaByType("vip"));
        cinemas.add(factory.getCinemaByType("vip"));
        cinemas.add(factory.getCinemaByType("vip"));

        for (Cinema cinema: cinemas) {
            cinema.createHall();
        }
    }
}
