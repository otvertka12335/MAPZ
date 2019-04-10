package _8_Composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Worker{
    private static int n = 0;
    private List<Worker> workers = new ArrayList<Worker>();

    public void add(Worker worker) { workers.add(worker); }

    public void remove(Worker worker) {
        workers.remove(worker);
    }

    @Override
    public void wiriteInfo() {
        for (Worker worker: workers) {
            if(worker instanceof Manager) {
                System.out.print("\t");
            } else if (worker instanceof ManagerSubWorker) {
                System.out.print("\t\t");
        }
            worker.wiriteInfo();
        }
    }
}
