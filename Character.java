package OOPS.Projects.GameCharacterSystem;

public class Character {
    private String name;
    private int health;
    private int level;

    Character(String name, int health, int level){
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public void attack(){

    }

    public void takeDamage(int damage){
        
    }

    public void showDetails(){

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
}
