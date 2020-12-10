package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin() {
        super.getHealth();
        setPhysAtt(15);
        setPhysDef(50);
        setMagicDef(20);
    }

    @Override
    public void healHimself() {
        this.setHealth(this.getHealth() + 25);
        if (getHealth() > 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
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
        return "Paladin{health=" + this.getHealth() + "}";
    }
}
