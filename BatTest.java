
// Create BatTest
public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat(300);
        // Attack 3 towns
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        // Eat 2 humans
        bat.eatHumans();
        bat.eatHumans();
        // Fly twice
        bat.fly();
        bat.fly();
    }
}