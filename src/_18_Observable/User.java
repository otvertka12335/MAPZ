package _18_Observable;

import java.util.List;

public class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handlEvent(List<String> films) {
        System.out.println("Dear " + name + ", we have new films:\n " + films + "\n==========\n");
    }
}
