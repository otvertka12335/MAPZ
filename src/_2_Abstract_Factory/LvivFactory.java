package _2_Abstract_Factory;

public class LvivFactory implements CinemaFactory {
    @Override
    public Place createPlace() {
        return new LvivPlace();
    }

    @Override
    public Tech createTech() {
        return new LvivTech();
    }
}
