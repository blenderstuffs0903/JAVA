public class Dog extends Animal {
    int size;
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
    public void walk(int steps) {
        for (int i = 1; i <= steps; i++) {
            System.out.println("Step " + i);
        }
    }
}
