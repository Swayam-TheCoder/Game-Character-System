package OOPS.Projects.GameCharacterSystem;

public class Mage extends Character{
    private String spell;

    Mage(String name, int health, int level, String spell){
        super(name, health, level);
        this.spell = spell;
    }

    @Override
    public void attack() {
        System.out.println(getName()+ " attacks using "+spell);
    }
}
