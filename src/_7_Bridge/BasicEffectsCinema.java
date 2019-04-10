package _7_Bridge;

public class BasicEffectsCinema implements EffectsCinema {
    protected Cinema cinema;

    public BasicEffectsCinema() {
    }

    public BasicEffectsCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void volumePlus() {
        System.out.println("Volume Up");
        cinema.setVolume(cinema.getVolume() + 10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down");
        cinema.setVolume(cinema.getVolume() - 10);
    }
}
