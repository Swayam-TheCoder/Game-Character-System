package OOPS.Projects.GameCharacterSystem;

public class Warrior extends Character{
    private String weapon;

    Warrior(String name, int health, int level, String weapon) {
        super(name, health, level);
        this.weapon = weapon;
    }

    @Override
    public void attack(){
        System.out.println(getName()+ " attacks with "+weapon);
    }
}
