package day11.task2;

public class Task2 {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(100, 30, 0, 80, 0);
        Paladin paladin = new Paladin(100, 15, 0, 50, 20);
        Magician magician = new Magician(100, 5, 20, 0, 80);
        Shaman shaman = new Shaman(100, 10, 15, 20, 20);

        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }
    }
}
