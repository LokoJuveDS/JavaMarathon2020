package day11.task2;

import java.lang.reflect.Field;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super.getHealth();
        physAtt = 30;
        physDef = 80;
        magicDef = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - this.getPhysAtt() * (100 - hero.getPhysDef()) / 100);
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "Warrior{health=" + this.getHealth() + "}";
    }
}
