package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    int magicAtt = 16;
    static final int HEALTH_AMOUNT = 50;
    static final int HEALTH_TEAM_AMOUNT = 30;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
    }

    @Override
    public void healHimself() {
        if (health + HEALTH_AMOUNT > MAX_HEALTH) health = MAX_HEALTH;
        else health += HEALTH_AMOUNT;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALTH_TEAM_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEALTH_TEAM_AMOUNT;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
