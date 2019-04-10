package _7_Bridge;

public class Standart implements Cinema {
    private boolean effects = false;
    private int volume = 10;
    private String status = "Standart";

    @Override
    public boolean isEffect() {
        return effects;
    }

    @Override
    public void onEffect() {
        effects = true;
    }

    @Override
    public void offEffect() {
        effects = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int vol) {
        volume = vol;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String stat) {
        status = stat;
    }

    @Override
    public void printInfo() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Standart.");
        System.out.println("| Effects " + (effects ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current status is " + status);
        System.out.println("------------------------------------\n");
    }
}
