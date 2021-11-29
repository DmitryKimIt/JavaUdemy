package day11.task2;

public class Warrior extends Hero{
    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

    public Warrior(){
    physDef=0.8;
    physAtt = 30;

}

}

