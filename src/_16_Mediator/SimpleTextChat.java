package _16_Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User manager;
    List<User> userList = new ArrayList<>();

    public void setManager(User manager) {
        this.manager = manager;
    }

    public void addUserToChat(User user) {
        this.userList.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: userList) {
            if(u != user) {
                u.getMessgae(message);
            }
        }

        manager.getMessgae(message);
    }
}
