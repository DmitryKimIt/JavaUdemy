package day7;

public class Player {
    private int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public void run() {  //исправлено
        if (this.stamina == MIN_STAMINA) return;
        this.stamina--;
        if(this.stamina == MIN_STAMINA) countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;

    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(int countPlayers) {
        this.countPlayers = countPlayers;
    } // this.player - исправлнео

}
