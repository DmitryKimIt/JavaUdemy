package day11.task2;

public abstract class Hero implements PhysAttack {
    int health; //(здоровье)
    double physDef; //(процент поглощения физического урона)
    double magicDef; //(процент поглощения магического урона)
    int physAtt; //(величина физической атаки), по необходимости
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;

    @Override
    public void physAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

    public Hero() {
        this.health = 100;
    }

}
