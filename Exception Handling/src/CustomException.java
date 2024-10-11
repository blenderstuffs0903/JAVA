class MyException extends Exception{
    MyException(String s) {
        super(s);
    }
}

public class CustomException {
    static int i;
    static int[] method() {
        System.out.println("Returning an array");
        return new int[]{1, 2, 3};
    }
    public static void main(String[] args) {
        int n;
        int[] array = new int[6];
        array[0] = 1;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(n);
        try {
            throw new MyException("My Exception was caught");
        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}