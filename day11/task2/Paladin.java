package day11.task2;

public class Paladin extends Hero implements Healer {
    static final int MAX_HEALTH = 100;
    static final int HEALTH_AMOUNT = 25;
    static final int HEALTH_TEAM_AMOUNT = 25;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_AMOUNT > MAX_HEALTH) health = MAX_HEALTH;
        else health += HEALTH_AMOUNT;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALTH_TEAM_AMOUNT > MAX_HEALTH) hero.health = MAX_HEALTH;
        else hero.health += HEALTH_TEAM_AMOUNT;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
