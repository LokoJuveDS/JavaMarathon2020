package day11.task2;

public abstract class Hero {

    private int health = 100;
    protected int physAtt;
    protected int magicAtt;
    protected int physDef;
    protected int magicDef;

    public Hero() {
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected int getHealth() {
        return health;
    }

    protected int getPhysAtt() {
        return physAtt;
    }

    protected int getMagicAtt() {
        return magicAtt;
    }

    protected int getPhysDef() {
        return physDef;
    }

    protected int getMagicDef() {
        return magicDef;
    }
}

