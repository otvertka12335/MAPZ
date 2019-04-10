package _8_Composite;

public class Main {
    private static int n = 0;

    public static void main(String[] args) {
        Worker boss1 = new Boss();

        Worker manager1 = new Manager();
        Worker manager2 = new Manager();

        Worker managerSub1 = new ManagerSubWorker();
        Worker managerSub2 = new ManagerSubWorker();

        Team team = new Team();
        Team team1 = new Team();
        Team team2 = new Team();

        Team team3 = new Team();

        team2.add(managerSub1);
        team2.add(managerSub2);


        team1.add(manager1);
        team1.add(team2);
        team1.add(manager2);



        team.add(boss1);
        team.add(team1);

        team3.add(team);
        team3.wiriteInfo();


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        team.remove(team1);
        team3.wiriteInfo();

    }
}
