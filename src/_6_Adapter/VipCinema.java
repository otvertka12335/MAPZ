package _6_Adapter;

public class VipCinema {
    private int countSofa;

    public VipCinema(int countSofa) {
        this.countSofa = countSofa;
    }

    public int getCountSofa() {
        return countSofa;
    }

    public int getPlace() {
        return this.getCountSofa() * 2;
    }
}
