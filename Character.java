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
        System.out.println(name+ " is attacking");
    }

    public void takeDamage(int damage){
        if(damage <= 0){
            System.out.println("Invalid Damage");
            return;
        }

        health -= damage;
        if(health < 0){
            health = 0;
        }

        System.out.println(name+ " took " +damage+ " damage");
    }

    public void showDetails(){
        System.out.println("name: "+name);
        System.out.println("health: "+health);
        System.out.println("level: "+level);
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
