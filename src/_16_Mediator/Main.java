package _16_Mediator;

public class Main {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User manager = new Manager(chat, "Manager");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        chat.setManager(manager);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello I want to buy Ticket");
        manager.sendMessage("Ok");
    }
}
