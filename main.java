package OOPS.Projects.GameCharacterSystem;

import javax.smartcardio.CardChannel;

public class main {

    public static void main(String[] args) {
        Character warrior = new Warrior("Thor", 500, 4, "Hammer");
        Character archer = new Archer("Super Archer", 200, 7, "Frozen Arrow");
        Character mage = new Mage("Wizard", 300, 9, "Poison Spell");


        System.out.println("----WARRIOR----");
        warrior.showDetails();
        warrior.attack();
        warrior.takeDamage(30);

        System.out.println();

        System.out.println("----Archer----");
        archer.showDetails();
        archer.attack();
        archer.takeDamage(50);

        System.out.println();

        System.out.println("----Mage----");
        mage.showDetails();
        mage.attack();
        mage.takeDamage(40);

        System.out.println();
        System.out.println("--- ALL CHARACTERS ATTACK ---");

        Character[] characters = {
                new Warrior("Thor",100,5,"Sword"),
                new Mage("Merlin", 80,6,"Fireball"),
                new Archer("Robin",90,4,"Poison Arrow")
        };

        for(Character ch: characters){
            ch.attack();
        }

    }
}
