package OOPS.Projects.GameCharacterSystem;

import javax.smartcardio.CardChannel;

public class main {

    public static void main(String[] args) {
        Character warrior = new Warrior("Thor", 500, 4, "Hammer");
        Character archer = new Archer("Super Archer", 200, 7, "Frozen Arrow");


        System.out.println("----WARRIOR----");
        warrior.showDetails();
        warrior.attack();
        warrior.takeDamage(30);

        System.out.println();

        System.out.println("----Archer----");
        archer.showDetails();
        archer.attack();
        archer.takeDamage(50);



    }
}
