package _21_Template_Method;

import java.util.Random;

public abstract class Visitor {
    private int idTicket;
    protected PopCorns popCorn;
    private String name;

    Random random = new Random();

    public Visitor(PopCorns popCorn, String name) {
        this.popCorn = popCorn;
        this.name = name;
    }

    void watchFilms() {
        buyTicket();
        buyPopCorn();
        lookFilm();
        goToHome();
    }

    protected abstract void buyPopCorn();

    private void goToHome() {
        System.out.println(this.name + " goes to home");
    }

    protected void lookFilm() {
        System.out.println(this.name + " look film");
    }


    private void buyTicket() {
        this.idTicket = random.nextInt(10 - 1 + 1) + 1;
        System.out.println("Ticket bought");
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "idTicket=" + idTicket +
                ", popCorn='" + popCorn + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
