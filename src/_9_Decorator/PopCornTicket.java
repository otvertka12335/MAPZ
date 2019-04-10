package _9_Decorator;

public class PopCornTicket extends TicketDecorator {

    public PopCornTicket(Ticket ticket) {
        super(ticket);
    }

    public int addPopCorn() {
        return 50;
    }

    @Override
    public int createTicket() {
        return super.createTicket() + addPopCorn();
    }
}
