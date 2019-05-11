package _17_Memento;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Repository repository = new Repository();

        System.out.println("==Cinema Ticket==");
        ticket.setData("Venom");

        System.out.println(ticket);

        System.out.println("==Save Current Ticket==");
        repository.setSave(ticket.save());

        System.out.println("==Change Ticket==");
        ticket.setData("Spider Man");

        System.out.println(ticket);

        System.out.println("==Restore ticket==");
        ticket.load(repository.getSave());

        System.out.println(ticket);
    }
}
