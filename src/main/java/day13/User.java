package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    //имя пользователя
    private final String username;
    //на кого подписан пользователь, т.е. его подписки
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    //подписывает текущего пользователя на переданного в конструкторе, т.е. добавляет user в список подписок
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    //проверяет содержит ли список подписок текущего пользователя переданного user
    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    //проверяет содержатся ли в подписках друг у друга пользователи
    public boolean isFriend(User user) {
        return isSubscribed(user) && user.subscriptions.contains(this);
    }

    //отправка сообщения от текущего пользователя к user
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
