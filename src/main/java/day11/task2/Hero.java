package day11.task2;

public abstract class Hero {

    private int health;
    private int physAtt;
    private int magicAtt;
    private int physDef;
    private int magicDef;

    public Hero(int health, int physAtt, int magicAtt, int physDef, int magicDef) {
        this.health = health;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }
}
