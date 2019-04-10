package _12_Proxy;

public class Main {
    public static void main(String[] args) {
        CinemaLib ticket = new TicketArchiveProxy(1, "Some title");

        ticket.archiveTicket();
        System.out.println(ticket.toString());

        ticket.archiveTicket();
        System.out.println(ticket.toString());
    }
}
