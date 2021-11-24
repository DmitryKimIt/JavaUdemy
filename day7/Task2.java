package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random stamina = new Random();
        Player player1 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player player2 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player player3 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player player4 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player player5 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player player6 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player player7 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player player8 = new Player(stamina.nextInt((Player.MAX_STAMINA-Player.MIN_STAMINA) + 1) + 90);
        Player.info();

        for (int i = player1.getStamina(); i >= Player.MIN_STAMINA; i--) {
            player1.run();
        }
        System.out.println(Player.countPlayers);
    }


}


