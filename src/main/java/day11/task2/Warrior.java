package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super.getHealth();
        setPhysAtt(30);
        setPhysDef(80);
        setMagicDef(0);
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
