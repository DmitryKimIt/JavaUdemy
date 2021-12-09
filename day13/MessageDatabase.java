package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    /* метод addNewMessage- этот метод “отправляет” новое сообщение
     * от пользователя u1 пользователю u2 с текстом text.
     * Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
     */
    public static void addNewMessage(User u1, User u2, String text) {
//        Message message = new Message(u1, u2, text);
//        messages.add(message);
        messages.add(new Message(u1, u2, text)); // сократил
    }

    /* getMessages - возвращает список всех сообщений в “базе данных”. */
    public static List<Message> getMessages() {
        return messages;
    }

    /* showDialog - этот метод должен вывести цепочку сообщений (диалог)
     *пользователей u1 и u2. Формат вывода должен быть таким:
     */
    public static void showDialog(User u1, User u2) {
        for (Message x : messages) {
//            if (x.sender.getUsername().equals(u1.getUsername()) && x.receiver.getUsername().equals(u2.getUsername())) {
//                System.out.println(x.sender.getUsername()+": " + x.text);
//            }
//            if (x.sender.getUsername().equals(u2.getUsername()) && x.receiver.getUsername().equals(u1.getUsername())) {
//                System.out.println(x.sender.getUsername()+": " + x.text);
//            }
            if (x.getSender().equals(u1) && x.getReceiver().equals(u2) || (x.getSender().equals(u2) && x.getReceiver().equals(u1))) {
                System.out.println(x.getSender().getUsername() + ": " + x.getText());
            }
        }
    }

}
