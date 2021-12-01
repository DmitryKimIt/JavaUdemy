package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Дима");
        User u2 = new User("Лена");
        User u3 = new User("Ксюша");

        MessageDatabase.addNewMessage(u1,u2, "Привет");
        MessageDatabase.addNewMessage(u1,u2, "Лена чего не отвечаешь");
        MessageDatabase.addNewMessage(u2,u1, "Привет Дима");
        MessageDatabase.addNewMessage(u2,u1, "Была занята");
        MessageDatabase.addNewMessage(u2,u1, "С Ксюшей занималась");
        MessageDatabase.addNewMessage(u3,u1, "Привет");
        MessageDatabase.addNewMessage(u3,u1, "Папа ты скоро?");
        MessageDatabase.addNewMessage(u3,u1, "Купи хлеба, пожалуйста");
        MessageDatabase.addNewMessage(u1,u3, "Ксюша, сходи сама");
        MessageDatabase.addNewMessage(u1,u3, "Деньги есть?");
        MessageDatabase.addNewMessage(u1,u3, "и молока возьми");
        MessageDatabase.addNewMessage(u3,u1, "Хорошо я сама схожу");
        MessageDatabase.showDialog(u1,u3);
    }
}
