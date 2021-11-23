package day6;

public class Task3 {
    public static void main(String[] args) {
        Student IvanovK = new Student("Константин");
        Teacher VerevochkinaL = new Teacher("Лидия", "Мировая экономика");
        VerevochkinaL.evaluate(IvanovK.getName());
    }
}
