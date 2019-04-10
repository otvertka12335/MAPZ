package _9_Decorator;

public class CinemaTicket implements Ticket {
    @Override
    public int createTicket() {
        return 50;
    }
}
