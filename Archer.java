package OOPS.Projects.GameCharacterSystem;

public class Archer extends Character{

    private String arrowType;

    Archer(String name, int health, int level, String arrowType){
        super(name, health, level);
        this.arrowType = arrowType;
    }

    @Override
    public void attack() {
        System.out.println(getName()+ " attacks using "+arrowType);
    }
}
