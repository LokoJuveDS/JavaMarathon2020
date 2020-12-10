package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(int health, int physAtt, int magicAtt, int physDef, int magicDef) {
        super(health, physAtt, magicAtt, physDef, magicDef);
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
