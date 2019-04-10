package _5_Singleton;

final class Cinema {
    private static Cinema instance;
    public String value;

    private Cinema(String value) {
        this.value = value;
    }

    public static Cinema getInstance(String value) {
        if (instance == null) {
            instance = new Cinema(value);
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Cinema cinema = Cinema.getInstance("Cinema");
        Cinema anotherCinema = Cinema.getInstance("VIP");
        System.out.println(cinema.value.hashCode());
        System.out.println(anotherCinema.value.hashCode());
    }
}