package _7_Bridge;

public class AdvancedEffectsCinema extends BasicEffectsCinema {

    public AdvancedEffectsCinema(Cinema cinema) {
        cinema.onEffect();
        super.cinema = cinema;
    }

    public void mute() {
        System.out.println("Mute");
        cinema.setVolume(0);
    }

}
