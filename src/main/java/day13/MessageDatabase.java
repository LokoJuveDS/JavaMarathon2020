package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    //список вообще всех сообщений формирующийся по мере их отправления
    private static List<Message> messages = new ArrayList<>();

    //создаёься новый объект Сообщения и добавляется в БД
    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    //проходит по всей БД и сверяет с тем кто Отправил и кто Получил Сообщение, и если совпадают оба, то выводит на экран
    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().equals(u1) && message.getReceiver().equals(u2)) {
                System.out.println(message.getSender() + ": " + message.getText());
            }

            if (message.getSender().equals(u2) && message.getReceiver().equals(u1)) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
