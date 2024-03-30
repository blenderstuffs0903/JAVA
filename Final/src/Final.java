public final class Final { // Final classes must not to be extender/inherited
    public static final double PI = 3.14; // We cannot change the value
    public static final double VAL;
    static {
        VAL = Math.random(); // static initializer
    }
    final int X;
    public Final() {
        X = 25;
    }
//    public void setX() {
//        x = 25; --> We can only initialize a non-static final variable using a constructor or at the time of declaration.
//                    Because final variables are needed to be initialized be we make instance of that class in which we declared the final variable
//    }

    final void finalMethod() {
        System.out.println("You cannot override me."); // Final Methods cannot be overridden
    }

}
