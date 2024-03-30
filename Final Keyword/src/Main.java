public class Main {
    public static void main(String[] args) {
        System.out.println(Final.PI);
        System.out.println(Final.VAL);
        Final finalClass = new Final();
        System.out.println(finalClass.X);
        finalClass.finalMethod();
    }
}