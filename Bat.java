


// Create a Bat class that inherits from the Mammal class
public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(energyLevel);
    }
    // fly() decreases energyLevel by 50 and prints "The bat is airborne!"
    public void fly() {
        System.out.println("The bat is airborne!");
        energyLevel -= 50;
        System.out.println("The bat's energy level is now " + energyLevel);
    }
    // eatHumans() increases energyLevel by 25 and prints "The bat feasts on a human!"
    public void eatHumans() {
        System.out.println("The bat feasts on a human!");
        energyLevel += 25;
        System.out.println("The bat's energy level is now " + energyLevel);
    }
    // attackTown() decreases energyLevel by 100 and prints "The bat attacks a defenseless town as the townsfolk hide and await dawn!"
    public void attackTown() {
        System.out.println("The bat attacks a defenseless town as the townsfolk hide and await dawn!");
        energyLevel -= 100;
        System.out.println("The bat's energy level is now " + energyLevel);
    }
}