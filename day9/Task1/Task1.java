package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student ivanov = new Student("Иван", "Группа 303");
        Teacher zagrebina = new Teacher("Юлия Владимировна", "Мировая экономика");
        System.out.println(ivanov.getGroupName());
        System.out.println(zagrebina.getSubjectName());
        ivanov.printInfo();
        zagrebina.printInfo();
    }
}
