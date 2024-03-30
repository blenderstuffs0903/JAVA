public class Duck {
    private int size;
    private static int duckCount = 0; // Static variable are initialized when the class is loaded by JVM.
                                      // A static variable is a variable shared by all members of a given class.

    public Duck() {
        duckCount++;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getDuckCount() {
        return duckCount;
    }

}
