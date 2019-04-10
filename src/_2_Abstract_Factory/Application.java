package _2_Abstract_Factory;

public class Application {
    private Place place;
    private Tech tech;

    public Application(CinemaFactory factory) {
        place = factory.createPlace();
        tech = factory.createTech();
    }

    public void show() {
        place.show();
        tech.show();
    }
}
