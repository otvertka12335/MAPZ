package _7_Bridge;

public interface Cinema {
    boolean isEffect();
    void onEffect();
    void offEffect();
    int getVolume();
    void setVolume(int vol);
    String getStatus();
    void setStatus(String status);
    void printInfo();
}
