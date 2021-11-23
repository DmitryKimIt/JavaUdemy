package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameCity;
        boolean loop= true;
        while (loop) {
            nameCity = scanner.nextLine();
            switch (nameCity) {
                case "Москва":
                    System.out.println("Россия");
                    break;
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                    System.out.println("Италия");
                    break;
                case "Милан":
                    System.out.println("Италия");
                    break;
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                    System.out.println("Англия");
                    break;
                case "Манчестер":
                    System.out.println("Англия");
                    break;
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                    System.out.println("Германия");
                    break;
                case "Мюнхен":
                    System.out.println("Германия");
                    break;
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    loop = false;
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
    }
}
