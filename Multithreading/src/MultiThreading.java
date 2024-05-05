class Mythread extends Thread {
    String s = null;

    public Mythread(String s) {
        this.s = s;
        start();
    }

    public void run() {
        System.out.println(s);
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        String s = "This Thread is running";
        Mythread newThread = new Mythread(s);
    }
}
