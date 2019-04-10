package _6_Adapter;

public class Adapter extends StandartCinema {
    private VipCinema vipCinema;

    public Adapter(VipCinema vipCinema) {
        this.vipCinema = vipCinema;
    }

    @Override
    public int getPlace() {
        return vipCinema.getPlace() / 2;
    }
}
