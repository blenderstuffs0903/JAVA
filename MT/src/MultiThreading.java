class MyThread extends Thread {
    public void run() {
        System.out.println("ID: " + threadId());
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread td = new MyThread();
        td.start();
    }
}
