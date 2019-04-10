package _9_Decorator;

public class TicketDecorator implements Ticket {
    Ticket ticket;
    public int price = 0;

    public TicketDecorator(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public int createTicket() {
        return price += ticket.createTicket();
    }
}
