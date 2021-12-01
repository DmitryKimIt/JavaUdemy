package day13;

import java.util.Date;

public class Message {
    User sender; // - отправитель сообщения
    User receiver; // - получатель сообщения
    String text; //- текст сообщения
    Date date; // - дата отправки сообщения

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    @Override
    public String toString() {
        return "FROM: "+ sender +"\nTO: " + receiver + "\nON: " + date + "\n" + text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
