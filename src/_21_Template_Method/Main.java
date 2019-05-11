package _21_Template_Method;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Visitor> visitors = new ArrayList<>();

        Visitor visitor1 = new People(PopCorns.POP_CORN_SALT, "Vadym");
        Visitor visitor2 = new People(PopCorns.POP_CORN_CHEESE, "Roma");

        visitors.add(visitor1);
        visitors.add(visitor2);

        for(Visitor visitor: visitors) {
            System.out.println(visitor.toString());
            visitor.watchFilms();
            System.out.println("\n\n");
        }

    }
}
