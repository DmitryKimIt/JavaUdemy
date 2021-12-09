package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions; // исправлено

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    //  метод subscribe подписывает пользователя на пользователя user
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    /*  метод isSubscribed - возвращает True,
     * если пользователь подписан на пользователя user и False, если не подписан. */
    public boolean isSubscribed(User user) {
//        for (User x: subscriptions) {
//            if (x.username.equals(user.getUsername())) return true;
//        }
        // исправлено на contains
        if(subscriptions.contains(user)){
            return true;
        }
        return false;
    }

    /* метод isFriend - возвращает True, если пользователь user является другом
     * и False, если пользователь user не является другом.
     * Подумайте, что такое дружба в контексте соц. сетей. */
    public boolean isFriend(User user) {
        return (this.isSubscribed(user) && user.isSubscribed(this));
    }

    /* метод sendMessage - отправляет сообщение с текстом text пользователю user.
     * Здесь должен использоваться статический метод из MessageDatabase.    */
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}
