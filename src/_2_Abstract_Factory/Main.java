package _2_Abstract_Factory;

public class Main {
    private static Application configApplicationFactory() {
        Application app = null;
        CinemaFactory factory;

        String cityName = "Lviv";

        if(cityName == "Lviv") {
            factory = new LvivFactory();
            app = new Application(factory);
        } else if (cityName == "Chernivtci") {
            factory = new ChernivtciFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configApplicationFactory();
        app.show();
    }
}
