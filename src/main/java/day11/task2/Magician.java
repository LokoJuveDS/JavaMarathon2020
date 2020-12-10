package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician(int health, int physAtt, int magicAtt, int physDef, int magicDef) {
        super(health, physAtt, magicAtt, physDef, magicDef);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - this.getMagicAtt() * (100 - hero.getMagicDef()) / 100);
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
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
        return "Magician{health=" + this.getHealth() + "}";
    }
}
