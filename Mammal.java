public class Mammal {
    // Every mammal should have an energy level that starts at 100.
    static int energyLevel;
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    // Display energyLevel
    public int displayEnergyLevel() {
        System.out.println("It's energy level is:" + energyLevel);
        return this.energyLevel;
    }
}
