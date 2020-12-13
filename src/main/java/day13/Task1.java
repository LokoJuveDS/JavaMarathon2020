package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Иван");
        User user2 = new User("Галина");
        User user3 = new User("Альберт");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет, Иван!");
        user2.sendMessage(user1, "У меня всё отлично! Прогаю.");
        user2.sendMessage(user1, "А как у тебя?");

        user3.sendMessage(user1, "Привет, Иван!");
        user3.sendMessage(user1, "Ты решил задачу 13 дня?");
        user3.sendMessage(user1, "У меня не получается реализовать методы.");

        user1.sendMessage(user3, "Привет, Альбрет!");
        user1.sendMessage(user3, "Давай разберемся вместе.");
        user1.sendMessage(user3, "Какой метод не получается?");

        user3.sendMessage(user1, "Метод showDialog.");

        MessageDatabase.showDialog(user1, user3);
        // сделали такой красивый вывод сообщения и не воспользовались
        System.out.println(MessageDatabase.getMessages().get(6));
    }
}
