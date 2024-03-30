public class Fish extends Animal implements Prey, Predator {
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish.");
    }

    public void hunt() {
        System.out.println("This fish is hunting a smaller fish.");
    }
}
