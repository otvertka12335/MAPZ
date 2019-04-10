package _9_Decorator;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new PopCornTicket(new ThreeDTicket(new CinemaTicket()));

        System.out.println(ticket.createTicket());
    }
}
