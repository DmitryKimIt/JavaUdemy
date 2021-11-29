package day11.task2;

public class Magician extends Hero implements MagicAttack{
    int magicAtt =20;
    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;

    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt*(1-hero.magicDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
