package _7_Bridge;

public class Main {
    public static void main(String[] args) {
        testDevice(new Standart());
        testDevice(new Vip());
    }

    public static void testDevice(Cinema cinema) {
        System.out.println("Tests with basic.");
        BasicEffectsCinema basic = new BasicEffectsCinema(cinema);
        basic.volumePlus();
        cinema.printInfo();

        System.out.println("Tests with advanced.");
        AdvancedEffectsCinema advanced = new AdvancedEffectsCinema(cinema);
        advanced.volumeDown();
        advanced.mute();
        cinema.printInfo();
    }
}
