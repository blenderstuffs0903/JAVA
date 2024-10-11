public class Duck extends Bird {
    int size;
    public Duck(int duckSize) {
        super(1);
        size = duckSize;
    }

    public Duck() {
//        super(); // super() class the constructor of the superclass. If we don't put super(), compiler puts it anyway bcz, superclass's constructor must run to build out the constructor part.
        System.out.println("Making a Duck");
        size = 27;
    }
}
