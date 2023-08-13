
//Create GorillaTest class
public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        // Throw 3 bananas
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        // Eat 2 bananas
        gorilla.eatBananas();
        gorilla.eatBananas();
        // Climb a tree
        gorilla.climb();
    }
}