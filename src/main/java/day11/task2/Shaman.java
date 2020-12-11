package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman() {
        super.getHealth();
        physAtt = 10;
        magicAtt = 15;
        physDef = 20;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        this.setHealth(this.getHealth() + 50);
        if (getHealth() > 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
        }
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
        return "Shaman{health=" + this.getHealth() + "}";
    }
}
