public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck(); // As Duck class inherits from Birds, Birds' constructor runs first to build the Bird's part of the object followed by running the Duck constructor to build the DUck part
        System.out.println(duck1.size + " -> Default constructor or no argument constructor");

        Duck duck2 = new Duck(40);
        System.out.println(duck2.size + " -> parameterized constructor");
    }
}