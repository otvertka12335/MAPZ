package _8_Composite;

public class ManagerSubWorker implements Worker {
    @Override
    public void wiriteInfo() {
        System.out.println("I'm a Sub Manager Worker");
    }
}
