public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.walk(5);
        // Polymorphism refers the ability of an object to identify as more than one type
        // In other words, it refers the ability of an object to take different forms.
        Animal animal1 = new Dog(); // Dog object is treated/identified or taking the form of Animal type. Animal type can be called Polymorphic type.
        animal1.makeSound(); // Due to polymorphism, makeSound() method is defined in the Animal class(superclass) and then overridden by Dog class.
        // The appropriate method is invoked during runtime. At compile time, the compiler only checks if the makeSound() method is declared in the superclass.
        // This is because the memory is dynamically allocated, meaning memory in allocated during runtime.
        // animal1.walk(5); As Animal class doesn't have the walk class, it will through an error.
        // If we declare a reference of super type that refers to a sub type, using that reference(of supertype) we can only call the methods that is declared in the super class.
        // We cannot call any method that is specific to the sub class. Same goes to the instance variables.


        Dog d;
//        d = animal1; -> incompatible types: Animal cannot be converted to Dog.
//        As the reference variable of animal type actually holds a Dog object, it can be explicitly convert it or cast it to a Dog object.
//        So that it can be assigned to a reference of Dog type.
        d = (Dog) animal1;
        System.out.println(d.size); // we can now call the instance members specific to Dog object as the reference referring to it is also a Dog type.


        Animal cat = new Cat();
        Animal pig = new Pig();
        Animal[] animals = {dog, cat, pig}; // Polymorphic Array
    }
}
