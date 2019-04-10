package _12_Proxy;

public class TicketArchiveProxy implements CinemaLib {
    private Integer id;
    private String title;
    private Ticket ticket;

    public TicketArchiveProxy(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Ticket #" + id + " " + (ticket.isStatus() ? "archived" : "not archived")
                + " used proxy";
    }

    @Override
    public Boolean archiveTicket() {
        if(ticket == null) {
            ticket = new Ticket(id, title);
        }
        return ticket.archiveTicket();
    }
}
