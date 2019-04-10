package _9_Decorator;

public class ThreeDTicket extends TicketDecorator {
    public ThreeDTicket(Ticket ticket) {
        super(ticket);
    }

    public int createTicket3D() {
        return 30;
    }

    @Override
    public int createTicket() {
        return super.createTicket() + createTicket3D();
    }
}
