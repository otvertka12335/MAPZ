package _2_Abstract_Factory;

public class ChernivtciFactory implements CinemaFactory {
    @Override
    public Place createPlace() {
        return new ChernivtciPlace();
    }

    @Override
    public Tech createTech() {
        return new ChernivtciTech();
    }
}
