

public class Gorilla extends Mammal {
    // inheriting the constructor from the superclass
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }
    // throwSomething() - decrease the gorilla's energy by 5 and print out a message indicating that the gorilla has thrown something
    public void throwSomething() {
        this.energyLevel -= 5;
        System.out.println("Gorilla threw a banana! It's energy level is now " + this.energyLevel);
    }
    // eatBananas() - increase the gorilla's energy by 10 and print out a message indicating the gorilla's satisfaction
    public void eatBananas() {
        this.energyLevel += 10;
        System.out.println("Gorilla eats a banana! It's energy level is now " + this.energyLevel);
    }
    // climb() - decrease the gorilla's energy by 10 and print out a message indicating the gorilla has climbed a tree
    public void climb() {
        this.energyLevel -= 10;
        System.out.println("Gorilla climbed a tree! It's energy level is now " + this.energyLevel);
    }
}