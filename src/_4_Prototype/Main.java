package _4_Prototype;

import java.util.Date;

interface iCopy {
    Object copy();
}

class TicketCinema implements iCopy{
    private String name;
    private int place;
    private Date startDate;

    public TicketCinema(String name, int place, Date startDate) {
        this.name = name;
        this.place = place;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Name of films: " + name + "\nYour place: " + place + ".\n\t\t Films started at " + startDate;
    }

    @Override
    public Object copy() {
        TicketCinema copy = new TicketCinema(name, place, startDate);
        return copy;
    }
}

public class Main {
    public static void main(String[] args) {
        TicketCinema original = new TicketCinema("Venom", 6, new Date());
        System.out.println(original);

        TicketCinema copy = (TicketCinema) original.copy();
        copy.setName("AquaMan");
        copy.setPlace(9);
        System.out.println(copy);

    }
}