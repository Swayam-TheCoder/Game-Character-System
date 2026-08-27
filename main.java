package OOPS.Projects.GameCharacterSystem;

public class main {

    public static void main(String[] args) {
        Character warrior = new Warrior("Thor", 100, 4, "Hammer");
        System.out.println("----WARRIOR----");
        warrior.showDetails();
        warrior.attack();
        warrior.takeDamage(30);
    }
}
