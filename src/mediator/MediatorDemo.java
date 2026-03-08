package mediator;

public class MediatorDemo {

    public static void main(String[] args) {

        ChatRoom chat = new ChatRoom();

        User user1 = new ChatUser(chat,"Ali");
        User user2 = new ChatUser(chat,"Dana");
        User user3 = new ChatUser(chat,"Arman");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Hello everyone!");
    }
}
